package org.ctag.back.app.endpoint.web.controller;

import org.ctag.back.app.endpoint.web.BaseControllerTest;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IndexControllerTest extends BaseControllerTest {
    private static final String INDEX = ROOT_WEB + "/index";

    @Test
    void getIndex() {
        ResponseEntity<String> response = get(INDEX, String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}