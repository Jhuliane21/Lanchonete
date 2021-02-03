package org.trabLanchonete.lanchonete.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lanche {
	
	@Id
	private double numero;
	private String nomeLanche;
	private String nomeIngrediente;
	private List<Ingrediente> ingredientes;
	
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
	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente.add(ingrediente);
	}
	public int getCodIngrediente() {
		return codIngrediente;
	}
	public void setCodIngrediente(int codIngrediente) {
		this.codIngrediente = codIngrediente;
	}
	public int getCodFornecedor() {
		return codFornecedor;
	}
	public void setCodFornecedor(int codFornecedor) {
		this.codFornecedor = codFornecedor;
	}
	
	
}
