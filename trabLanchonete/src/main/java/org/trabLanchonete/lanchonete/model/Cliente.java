package org.trabLanchonete.lanchonete.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	private int	   id;
	private String telefoneCliente;
	private String nomeCliente;
	private String enderecoCliente;
	private Pedido pedido;
	

	public Cliente() {
		
	}
	
	
	public Cliente( String telefoneCliente, String nomeCliente, String enderecoCliente) {
		super();
		
		this.telefoneCliente = telefoneCliente;
		this.nomeCliente = nomeCliente;
		this.enderecoCliente = enderecoCliente;
		
	}
	
	public String getID() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	public void addCliente(String telefoneCliente, String nomeCliente, String enderecoCliente ) {
		this.setTelefoneCliente(telefoneCliente);
		this.setNomeCliente(nomeCliente);
		this.setEnderecoCliente(enderecoCliente);
	}
	
}
