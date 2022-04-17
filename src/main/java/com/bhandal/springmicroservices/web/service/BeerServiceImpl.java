package com.bhandal.springmicroservices.web.service;

import com.bhandal.springmicroservices.web.model.BeetDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeetDto getBeerById(UUID beerId) {
        return BeetDto.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .upc(241134L)
                .build();
    }

    @Override
    public BeetDto saveBeerDto(BeetDto beetDto) {
        return BeetDto.builder()
                .id(UUID.randomUUID())
                .build();
    }
}
