package com.bhandal.springmicroservices.web.service;

import com.bhandal.springmicroservices.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveBeerDto(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    void deleteBeerById(UUID beerId);
}
