package org.ctag.back.app.endpoint.web.service;

import org.ctag.back.app.endpoint.web.dto.CarDto;

import java.util.UUID;

public interface CarService {
    CarDto getCar(UUID uuid);
}
