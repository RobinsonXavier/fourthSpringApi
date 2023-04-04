package com.exerciciospring4.crudlover.model;

import java.util.Date;

import com.exerciciospring4.crudlover.dto.CarDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Car {

  public Car(CarDTO data) {
    this.modelo = data.modelo();
    this.fabricante = data.fabricante();
    this.dataFabricacao = data.dataFabricacao();
    this.valor = data.valor();
    this.anoModelo = data.anoModelo();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 150, nullable = false, unique = true)
  private String modelo;

  @Column(length = 100, nullable = false)
  private String fabricante;

  @Column(length = 10, nullable = false)
  private Date dataFabricacao;

  @Column(nullable = false)
  private Double valor;

  @Column(nullable = false)
  private int anoModelo;
}
