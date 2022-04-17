package com.bhandal.springmicroservices.web.controller;

import com.bhandal.springmicroservices.web.model.BeetDto;
import com.bhandal.springmicroservices.web.service.BeerService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.awt.*;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
class BeerControllerTest {
//
//    @Mock
//    private BeerService beerService;
//
//    @Autowired
//    MockMvc mockMvc;
//
//    @Autowired
//    ObjectMapper objectMapper;
//
    BeetDto validBeer;

    @BeforeEach
    void setUp() {
        validBeer = BeetDto.builder()
                .id(UUID.randomUUID())
                .beerName("Coopers")
                .beerStyle("Pale_Ale")
                .build();
    }

    @AfterEach
    void tearDown() {
        validBeer = null;
    }

    @Test
    void getBeer() throws Exception {
//        given(beerService.getBeerById(any(UUID.class))).willReturn(validBeer);
//
//        mockMvc.perform(get("/api/v1/beer/" + validBeer.getId().toString()).accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
//                .andExpect(jsonPath("$.id", is(validBeer.getId().toString())))
//                .andExpect(jsonPath("$.beerName", is("Beer1")));


    }

    @Test
    void saveBeer() {
    }

    @Test
    void handleUpdate() {
    }
}