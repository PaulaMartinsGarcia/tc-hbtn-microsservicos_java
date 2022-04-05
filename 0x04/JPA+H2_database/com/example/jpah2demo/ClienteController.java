package com.example.jpah2demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpah2demo.model.Cliente;
import com.example.jpah2demo.repository.ClienteRepository;

@RestController
public class ClienteController {

  @Autowired
  private ClienteRepository clienteRepository;

  @PostMapping("/addClient")
  @ResponseStatus(HttpStatus.CREATED)
  public Cliente addClient(@RequestBody Cliente cliente) {
    return clienteRepository.save(cliente);
  }

  @GetMapping("/findAllClients")
  public List<Cliente> findAllClients() {
    return clienteRepository.findAll();
  }

  @GetMapping("/findClientById/{id}")
  public Optional<Cliente> findClientById(@PathVariable("id") Long idClient) {
	return clienteRepository.findById(idClient);
    
  }  

  @DeleteMapping("/removeClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removerCliente(@PathVariable("id") Long idClient){
	  clienteRepository.deleteById(idClient);
    }

  @PutMapping("/updateClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Cliente updateCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente){
	  return clienteRepository.save(cliente);
    }
}