package org.ctag.monolith.domain.car.repository;

import org.ctag.monolith.domain.car.entity.CarEO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CarRepository extends JpaRepository<CarEO, UUID> {
}
