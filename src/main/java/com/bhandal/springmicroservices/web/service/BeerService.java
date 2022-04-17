package com.bhandal.springmicroservices.web.service;

import com.bhandal.springmicroservices.web.model.BeetDto;

import java.util.UUID;

public interface BeerService {
    BeetDto getBeerById(UUID beerId);

    BeetDto saveBeerDto(BeetDto beetDto);
}
