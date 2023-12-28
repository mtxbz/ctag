package org.ctnb.back.app.web.controller;

import lombok.RequiredArgsConstructor;
import org.ctnb.back.app.web.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequiredArgsConstructor
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    @GetMapping("/{id}")
    public String getIndex(@PathVariable UUID id) {
        var car = carService.getCar(id);
        return "index";
    }
}
