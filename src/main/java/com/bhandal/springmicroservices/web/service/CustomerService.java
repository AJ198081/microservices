package com.bhandal.springmicroservices.web.service;

import com.bhandal.springmicroservices.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);
}
