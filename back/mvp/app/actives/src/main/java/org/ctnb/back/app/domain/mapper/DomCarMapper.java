package org.ctnb.back.app.domain.mapper;

import org.ctnb.back.app.domain.entity.CarEO;
import org.ctnb.back.app.domain.model.Car;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DomCarMapper {
    Car map(CarEO carEO);
}
