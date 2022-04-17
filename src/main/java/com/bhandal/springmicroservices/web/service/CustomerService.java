package com.bhandal.springmicroservices.web.service;

import com.bhandal.springmicroservices.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveCustomerDto(CustomerDto customerDto);

    CustomerDto updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteCutomerById(UUID customerId);
}
