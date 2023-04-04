package com.exerciciospring4.crudlover.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exerciciospring4.crudlover.dto.CarDTO;
import com.exerciciospring4.crudlover.model.Car;
import com.exerciciospring4.crudlover.repository.CarRepository;

@RestController
@RequestMapping("/crudlover/car")
public class CarController {

  @Autowired
  private CarRepository repository;
  
  @PostMapping
  public void createCar(@RequestBody CarDTO req) {
    repository.save(new Car(req));
  }

  @GetMapping
  public List<Car> listAll() {
    return repository.findAll();
  }


}
