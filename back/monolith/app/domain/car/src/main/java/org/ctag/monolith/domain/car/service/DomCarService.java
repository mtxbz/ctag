package org.ctag.monolith.domain.car.service;

import org.ctag.monolith.domain.car.model.Car;

import java.util.UUID;

public interface DomCarService {
    Car getCarById(UUID id);

    Car createCar(String carName);
}
