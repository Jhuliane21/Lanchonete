package org.trabLanchonete.lanchonete.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ingrediente {
	
	@Id
	@GeneratedValue
	private double codigo;
	private String nome;
	private Fornecedor fornecedor;
	
	public Ingrediente() {
		
	}
	
	public Ingrediente( double codigo, String nome, Fornecedor fornecedor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.fornecedor = fornecedor;
		
	}

	public double getCodigo() {
		return codigo;
	}


	public void setCodigo(double codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Fornecedor getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
}
