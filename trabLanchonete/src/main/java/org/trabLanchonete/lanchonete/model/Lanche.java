package org.trabLanchonete.lanchonete.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Lanche {
	
	@Id
	private double numero;
	private String nomeLanche;
	private String nomeIngrediente;
	@OneToMany 
	private List<Ingredientes> ingrediente;
	@OneToMany
	private List<Fornecedor> fornecedor;
	
	public double getNumero() {
		return numero;
	}
	public void setNumero(double numero) {
		this.numero = numero;
	}
	public String getNomeLanche() {
		return nomeLanche;
	}
	public void setNomeLanche(String nomeLanche) {
		this.nomeLanche = nomeLanche;
	}
	public String getNomeIngrediente() {
		return nomeIngrediente;
	}
	public void setNomeIngrediente(String nomeIngrediente) {
		this.nomeIngrediente = nomeIngrediente;
	}
	public List<Ingredientes> getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(List<Ingredientes> ingrediente) {
		this.ingrediente = ingrediente;
	}
	public List<Fornecedor> getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(List<Fornecedor> fornecedor) {
		this.fornecedor = fornecedor;
	}

	
	
}
� 2021 GitHub, Inc.