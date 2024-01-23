package org.ctag.monolith.endpoint.web.service;

import org.apache.commons.lang3.RandomStringUtils;
import org.ctag.monolith.domain.car.model.Car;
import org.ctag.monolith.endpoint.web.BaseServiceTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class CarServiceTest extends BaseServiceTest {

    @Autowired
    private CarService carService;

    @Test
    public void getCar() {
        var expected = new Car(UUID.randomUUID(), RandomStringUtils.random(10));

        when(domCarService.getCarById(any())).thenReturn(expected);

        var car = carService.getCar(expected.getId());

        Assertions.assertEquals(expected.getId(), car.getId());
        Assertions.assertEquals(expected.getName(), car.getName());
    }
}
