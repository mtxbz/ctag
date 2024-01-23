package org.ctag.monolith.endpoint.web.mapper;

import org.ctag.monolith.domain.car.model.Car;
import org.ctag.monolith.endpoint.web.dto.CarDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarMapper {
    Car map(CarDto carDto);

    CarDto map(Car car);
}
