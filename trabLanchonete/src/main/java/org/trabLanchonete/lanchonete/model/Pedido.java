package org.trabLanchonete.lanchonete.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue
	private int nroPedido;
	private LocalDateTime dtPedido;
	private String nomeCliente;
	private String telefone;
	private String endereco;
	@OneToMany
	private List<Lanche> Lanches;
	private int totalPedido;

	public Pedido() {
		
	}
	
	
	//Retirar
	public Pedido(int nroPedido, LocalDateTime dtPedido, String nomeCliente, String telefone, List<Lanche> lanches,
			int totalPedido) {
		super();
		this.nroPedido = nroPedido;
		this.dtPedido = dtPedido;
		this.nomeCliente = nomeCliente;
		this.telefone = telefone;
		Lanches = lanches;
		this.totalPedido = totalPedido;
	}



	//Entrega
	public Pedido(int nroPedido, LocalDateTime dtPedido, String nomeCliente, String telefone, String endereco,
			List<Lanche> lanches, int totalPedido) {
		super();
		this.nroPedido = nroPedido;
		this.dtPedido = dtPedido;
		this.nomeCliente = nomeCliente;
		this.telefone = telefone;
		this.endereco = endereco;
		Lanches = lanches;
		this.totalPedido = totalPedido;
	}




	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public int getTotalPedido() {
		return totalPedido;
	}


	public void setTotalPedido(int totalPedido) {
		this.totalPedido = totalPedido;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public LocalDateTime getDtPedido() {
		return dtPedido;
	}
	public void setDtPedido(LocalDateTime dtPedido) {
		this.dtPedido = dtPedido;
	}
	public int getNroPedido() {
		return nroPedido;
	}
	public void setNroPedido(int nroPedido) {
		this.nroPedido = nroPedido;
	}

	public List<Lanche> getLanches() {
		return Lanches;
	}


	public void setLanches(List<Lanche> lanches) {
		Lanches = lanches;
	}

	
//	public void FazerPedido(int nroPedido, LocalDateTime dtPedido, double valorTotal, Lanche lanche) {
//		Pedido p1 = new Pedido(nroPedido, dtPedido, lanche);
//		PedidoDAO.gravar(p1);
//	}
//	public void consultarPedido(int numero) {
//		PedidoDAO.listarUm(numero);
//	}
	
	
	
}
