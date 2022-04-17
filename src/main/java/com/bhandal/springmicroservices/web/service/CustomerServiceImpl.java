package com.bhandal.springmicroservices.web.service;

import com.bhandal.springmicroservices.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(customerId)
                .firstName("Amarjit")
                .lastName("Bhandal")
                .build();
    }
}
