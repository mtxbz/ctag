package org.ctag.monolith.endpoint.web.service.impl;

import lombok.RequiredArgsConstructor;
import org.ctag.monolith.domain.car.service.DomCarService;
import org.ctag.monolith.endpoint.web.dto.CarDto;
import org.ctag.monolith.endpoint.web.mapper.CarMapper;
import org.ctag.monolith.endpoint.web.service.CarService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarMapper carMapper;
    private final DomCarService domCarService;

    @Override
    public CarDto getCar(UUID uuid) {
        var car = domCarService.getCarById(uuid);
        return carMapper.map(car);
    }
}
