package org.ctag.monolith.domain.car.service;

import org.apache.commons.lang3.RandomStringUtils;
import org.ctag.monolith.domain.car.BaseServiceTest;
import org.ctag.monolith.domain.car.entity.CarEO;
import org.ctag.monolith.domain.car.mapper.NotFoundException;
import org.ctag.monolith.domain.car.repository.CarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

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
