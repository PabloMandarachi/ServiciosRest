package com.example.rest;

import com.example.model.Cliente;
import com.example.repositorio.IClienteRepo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "API REST clientes")
@RestController
@RequestMapping("/clientes")
public class RestDemoController {

  @Autowired
  private IClienteRepo repo;

  @ApiOperation(value = "Retorna lista de clientes")
  @GetMapping
  public List<Cliente> listar() {
    return repo.findAll();
  }
  
  @ApiOperation(value = "Crea un nuevo cliente")
  @PostMapping
  public void insertar(@RequestBody Cliente cli) {
    repo.save(cli);
  }
  
  @ApiOperation(value = "Actualiza datos de un clientes")
  @PutMapping
  public void modificar(@RequestBody Cliente cli) {
    repo.save(cli);
  }
  
  @ApiOperation(value = "Elimina cliente")
  @DeleteMapping(value = "/{id}")
  public void eliminar(@PathVariable("id") Integer id) {
    repo.deleteById(id);
  }
}
