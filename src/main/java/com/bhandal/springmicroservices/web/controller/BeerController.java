package com.bhandal.springmicroservices.web.controller;

import com.bhandal.springmicroservices.web.model.BeetDto;
import com.bhandal.springmicroservices.web.service.BeerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
@AllArgsConstructor
public class BeerController {

    private final BeerService beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeetDto> getBeer(@PathVariable UUID beerId) {
        return new ResponseEntity<BeetDto>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BeetDto> saveBeer(@RequestBody BeetDto beetDto) {

        final BeetDto savedDto = beerService.saveBeerDto(beetDto);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer/" + savedDto.getId().toString());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }


}
