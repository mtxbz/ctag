package org.ctag.monolith.endpoint.tgrm.controller;

import org.ctag.monolith.endpoint.tgrm.BaseControllerTest;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RestIndexControllerTest extends BaseControllerTest {

    private static final String STATS = ROOT_API + "/stats";
    private static final String STATS_BY_ID = ROOT_API + "/stats/{id}";

    @Test
    void getStats() {
        ResponseEntity<String> response = get(STATS, String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(MediaType.APPLICATION_JSON, response.getHeaders().getContentType());
    }

    @Test
    void getStatsById() {
        var expect = "sdsdfgr";
        ResponseEntity<String> response = get(STATS_BY_ID, String.class, expect);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(MediaType.APPLICATION_JSON, response.getHeaders().getContentType());
    }
}