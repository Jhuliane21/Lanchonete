package org.trabLanchonete.lanchonete.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.trabLanchonete.lanchonete.model.Pedido;

public class PedidoRepositorio {
	@PersistenceContext
	private EntityManager manager;

	public void inserir(Pedido pedido) {
		manager.persist(pedido);
	}
	
	public void atualizar(Pedido pedido) {
		manager.merge(pedido);
	}
	
	public void excluir(Pedido pedido) {
		manager.remove(pedido);
	}
	
	public Pedido getPedido(int numero) {
		return manager.find(Pedido.class, numero);
	}
	
	public List<Pedido> getPedidos() {
		TypedQuery<Pedido> query = manager.createQuery("select p from Pedido p", Pedido.class);
		return query.getResultList();
	}

}
