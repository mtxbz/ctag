package org.ctag.back.app.domain.service;

import org.apache.commons.lang3.RandomStringUtils;
import org.ctag.back.app.domain.BaseServiceTest;
import org.ctag.back.app.domain.entity.CarEO;
import org.ctag.back.app.domain.mapper.NotFoundException;
import org.ctag.back.app.domain.repository.CarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DomCarServiceTest extends BaseServiceTest {

    @Autowired
    private DomCarService domCarService;
    @Autowired
    private CarRepository carRepository;

    @Test
    public void getCarByIdWithException() {
        assertThrows(NotFoundException.class, () -> domCarService.getCarById(UUID.randomUUID()));
    }

    @Test
    public void getCarById() {
        var expected = CarEO.builder()
                .name(RandomStringUtils.randomAlphabetic(40))
                .build();
        carRepository.save(expected);

        var car = domCarService.getCarById(expected.getId());

        assertEquals(expected.getId(), car.getId());
        assertEquals(expected.getName(), car.getName());
    }

    @Test
    public void createCar() {
        var car = domCarService.createCar(RandomStringUtils.randomAlphabetic(40));

        assertNotNull(car);
        assertNotNull(car.getId());

        var actual = carRepository.findById(car.getId()).orElse(null);

        assertNotNull(actual);
        assertEquals(car.getName(), actual.getName());
    }
}
