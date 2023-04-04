package com.exerciciospring4.crudlover.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exerciciospring4.crudlover.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
  
}
