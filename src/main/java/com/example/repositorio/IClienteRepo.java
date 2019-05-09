package com.example.repositorio;

import com.example.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepo extends JpaRepository<Cliente, Integer> {

}
