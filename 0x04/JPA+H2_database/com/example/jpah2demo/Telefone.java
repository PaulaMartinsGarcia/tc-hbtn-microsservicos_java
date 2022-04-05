package com.example.jpah2demo.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Telefone {
	@Id
	private Long id;
	private Integer DDD;
	private Integer numero;
	
	public Telefone() {
		
	}
	
	public Telefone(Long id, Integer dDD, Integer numero) {
		super();
		this.id = id;
		DDD = dDD;
		this.numero = numero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getDDD() {
		return DDD;
	}

	public void setDDD(Integer dDD) {
		DDD = dDD;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(DDD, id, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		return Objects.equals(DDD, other.DDD) && Objects.equals(id, other.id) && Objects.equals(numero, other.numero);
	}
	
	
}
