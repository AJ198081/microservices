package com.bhandal.springmicroservices.web.service;

import com.bhandal.springmicroservices.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .upc(241134L)
                .build();
    }

    @Override
    public BeerDto saveBeerDto(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {

        return null;
    }

    @Override
    public void deleteBeerById(UUID beerId) {
        //TODO: delete Beer
    }
}
