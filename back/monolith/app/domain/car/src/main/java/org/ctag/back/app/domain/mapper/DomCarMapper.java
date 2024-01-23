package org.ctag.back.app.domain.mapper;

import org.ctag.back.app.domain.entity.CarEO;
import org.ctag.back.app.domain.model.Car;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DomCarMapper {
    Car map(CarEO carEO);
}
