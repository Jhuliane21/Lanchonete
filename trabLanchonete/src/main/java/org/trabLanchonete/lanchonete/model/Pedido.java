package org.trabLanchonete.lanchonete.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.trabLanchonete.lanchonete.dao.PedidoDAO;

@Entity
public class Pedido {
	
	@Id
	private int nroPedido;
	private LocalDateTime dtPedido;
	private String nomeCliente;
	private String telefone;
	private String endereco;
	private Lanche lanche;

	public Pedido() {
		
	}
	
	
	public Pedido(int nroPedido, LocalDateTime dtPedido, String nomeCliente, String telefone, String endereco, List<Lanche> lanches) {
		super();
		this.nroPedido = nroPedido;
		this.dtPedido = dtPedido;
		this.nomeCliente = nomeCliente;
		this.telefone = telefone;
		this.endereco = endereco;
		this.Lanches = lanches;
		
	}
	public String getnomeCliente() {
		return nomeCliente;
	}
	public void setnomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public LocalDateTime getEndereco() {
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
	public Cliente getCliente() {
		return cliente;
	}
	public Cliente getLanches() {
		return lanche;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void setLanches(Lanche lanche) {
		this.lanche = lanche;
	}

	
	public void FazerPedido(int nroPedido, LocalDateTime dtPedido, double valorTotal, Cliente cliente, Lanche lanche) {
		Pedido p1 = new Pedido(nroPedido, dtPedido, cliente, lanche);
		PedidoDAO.gravar(p1);
	}
	public void consultarPedido(int numero) {
		PedidoDAO.listarUm(numero);
	}
	
	
	
}
