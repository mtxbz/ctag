package org.ctnb.back.app.web.service;

import org.apache.commons.lang3.RandomStringUtils;
import org.ctnb.back.app.domain.model.Car;
import org.ctnb.back.app.web.BaseServiceTest;
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
