package org.ctnb.back.app.web.service;

import org.ctnb.back.app.web.dto.CarDto;

import java.util.UUID;

public interface CarService {
    CarDto getCar(UUID uuid);
}
