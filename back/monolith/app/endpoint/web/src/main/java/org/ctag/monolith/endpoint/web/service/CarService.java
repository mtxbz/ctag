package org.ctag.monolith.endpoint.web.service;

import org.ctag.monolith.endpoint.web.dto.CarDto;

import java.util.UUID;

public interface CarService {
    CarDto getCar(UUID uuid);
}
