package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {

  @Id
  private int idCliente;
  @Column(name = "nombre")
  private String nombre;
  @Column(name = "dni")
  private double dni;

  public int getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(int idCliente) {
    this.idCliente = idCliente;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getDni() {
    return dni;
  }

  public void setDni(double dni) {
    this.dni = dni;
  }

}
