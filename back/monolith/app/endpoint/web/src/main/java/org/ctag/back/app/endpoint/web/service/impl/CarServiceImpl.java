package org.ctag.back.app.endpoint.web.service.impl;

import lombok.RequiredArgsConstructor;
import org.ctag.back.app.domain.service.DomCarService;
import org.ctag.back.app.endpoint.web.dto.CarDto;
import org.ctag.back.app.endpoint.web.mapper.CarMapper;
import org.ctag.back.app.endpoint.web.service.CarService;
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
