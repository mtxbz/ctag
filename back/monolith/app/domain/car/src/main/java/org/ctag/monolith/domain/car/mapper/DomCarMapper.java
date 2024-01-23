package org.ctag.monolith.domain.car.mapper;

import org.ctag.monolith.domain.car.entity.CarEO;
import org.ctag.monolith.domain.car.model.Car;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DomCarMapper {
    Car map(CarEO carEO);
}
