package org.ctnb.back.web.controller;

import org.ctnb.back.web.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IndexControllerTest extends BaseTest {
    private static final String INDEX = ROOT_WEB + "/index";

    @Test
    void getIndex() {
        ResponseEntity<String> response = get(INDEX, String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}