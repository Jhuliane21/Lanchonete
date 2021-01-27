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
	private Cliente cliente;
	private Lanche lanche;
	
	List<Lanche> Lanches;

	public Pedido() {
		
	}
	
	
	public Pedido(int nroPedido, LocalDateTime dtPedido, Cliente cliente, List<Lanche> lanches) {
		super();
		this.nroPedido = nroPedido;
		this.dtPedido = dtPedido;
		this.cliente = cliente;
		this.Lanches = lanches;
		
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
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void setLanches(List<Lanche> lanches) {
		this.Lanches = lanches;
	}
	
	public void FazerPedido(int nroPedido, LocalDateTime dtPedido, double valorTotal, Cliente cliente, List<Lanche> lanches) {
		Pedido p1 = new Pedido(nroPedido, dtPedido, cliente, lanches);
		PedidoDAO.gravar(p1);
	}
	
	
}
