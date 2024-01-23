package org.ctnb.back.app.domain.service;

import org.ctnb.back.app.domain.model.Car;

import java.util.UUID;

public interface DomCarService {
    Car getCarById(UUID id);

    Car createCar(String carName);
}
