package org.ctnb.back.app.domain.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ctnb.back.app.domain.entity.CarEO;
import org.ctnb.back.app.domain.mapper.DomCarMapper;
import org.ctnb.back.app.domain.mapper.NotFoundException;
import org.ctnb.back.app.domain.model.Car;
import org.ctnb.back.app.domain.repository.CarRepository;
import org.ctnb.back.app.domain.service.DomCarService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class DomCarServiceImpl implements DomCarService {

    private final CarRepository carRepository;
    private final DomCarMapper domCarMapper;

    @Override
    public Car getCarById(UUID uuid) {
        var carEO = carRepository.findById(uuid).orElseThrow(() ->
                new NotFoundException(String.format("car with id '%s' not found", uuid)));

        // other logic

        return domCarMapper.map(carEO);
    }

    @Override
    public Car createCar(String carName) {
        var createdCar = carRepository.save(CarEO.builder().name(carName).build());

        // other logic

        return domCarMapper.map(createdCar);
    }
}
