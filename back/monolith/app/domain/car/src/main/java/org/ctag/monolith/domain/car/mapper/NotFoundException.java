package org.ctag.monolith.domain.car.mapper;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
