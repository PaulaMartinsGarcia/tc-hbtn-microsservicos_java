package com.example.jpah2demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpah2demo.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
