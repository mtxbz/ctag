package org.ctag.back.app.endpoint.tgrm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/tgrm")
public class RestIndexController {

    @GetMapping(value = "/stats", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getStats() {
        return ResponseEntity.ok("hello from rest tgrm index");
    }

    @GetMapping(value = "/stats/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, String>> getStatsById(@PathVariable("id") String id) {
        var response = new HashMap<String, String>();
        response.put("id", id);
        response.put("result", "hello from getStatusById");
        return ResponseEntity.ok(response);
    }
}
