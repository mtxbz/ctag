package org.ctag.back.app.domain.service;

import org.ctag.back.app.domain.model.Car;

import java.util.UUID;

public interface DomCarService {
    Car getCarById(UUID id);

    Car createCar(String carName);
}
