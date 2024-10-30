package com.example.projekt.repository;

import com.example.projekt.model.Car;
import com.example.projekt.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
}
