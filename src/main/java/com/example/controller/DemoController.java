package com.example.controller;

import com.example.model.Cliente;
import com.example.repositorio.IClienteRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

  @Autowired
  private IClienteRepo repo;

  /**pagina.**/
  @GetMapping("/greeting")
  public String greeting(@RequestParam(name = "name",required = false,defaultValue = "World")
      String name,Model model) {

    Cliente p = new Cliente();
    p.setIdCliente(2);
    p.setNombre("Andres");
    p.setDni(40904060);
    repo.save(p);

    model.addAttribute("name", name);
    return "greeting";
  }

  /**lista.**/
  @GetMapping("/listar")
  public String greeting(Model model) {

    model.addAttribute("clientes", repo.findAll());
    return "greeting";
  }

}
