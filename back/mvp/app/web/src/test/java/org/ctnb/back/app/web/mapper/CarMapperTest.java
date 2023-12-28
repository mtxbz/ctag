package org.ctnb.back.app.web.mapper;

import org.apache.commons.lang3.RandomStringUtils;
import org.ctnb.back.app.domain.model.Car;
import org.ctnb.back.app.web.BaseServiceTest;
import org.ctnb.back.app.web.dto.CarDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class CarMapperTest extends BaseServiceTest {

    @Autowired
    private CarMapper carMapper;

    @Test
    public void carDtoToCarMapping() {
        var carDto = CarDto.builder()
                .id(UUID.randomUUID())
                .name(RandomStringUtils.randomAlphabetic(10))
                .build();

        var car = carMapper.map(carDto);

        Assertions.assertEquals(carDto.getId(), car.getId());
        Assertions.assertEquals(carDto.getName(), car.getName());
    }

    @Test
    public void carToCarDtoMapping() {
        var car = Car.builder()
                .id(UUID.randomUUID())
                .name(RandomStringUtils.randomAlphabetic(10))
                .build();

        var carDto = carMapper.map(car);

        Assertions.assertEquals(car.getId(), carDto.getId());
        Assertions.assertEquals(car.getName(), carDto.getName());
    }
}
