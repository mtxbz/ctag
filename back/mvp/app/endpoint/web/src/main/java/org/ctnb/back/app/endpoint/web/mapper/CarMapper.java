package org.ctnb.back.app.endpoint.web.mapper;

import org.ctnb.back.app.domain.model.Car;
import org.ctnb.back.app.endpoint.web.dto.CarDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarMapper {
    Car map(CarDto carDto);

    CarDto map(Car car);
}
