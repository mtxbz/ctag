package org.ctag.monolith.endpoint.web.controller;

import org.ctag.monolith.endpoint.web.BaseControllerTest;
import org.ctag.monolith.endpoint.web.dto.CarDto;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class CarControllerTest extends BaseControllerTest {
    private static final String CAR = ROOT_WEB + "/car/{id}";


    @Test
    void getCarById() {
        when(carService.getCar(any())).thenReturn(CarDto.builder().build());

        ResponseEntity<String> response = get(CAR, String.class, UUID.randomUUID());
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}