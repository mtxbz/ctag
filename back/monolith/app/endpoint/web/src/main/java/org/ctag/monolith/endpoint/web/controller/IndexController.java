package org.ctag.monolith.endpoint.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/index")
public class IndexController {

    @GetMapping
    public String getIndex() {
        return "index";
    }
}
