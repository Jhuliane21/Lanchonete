import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.lanchonetemaven.modelo.Produto;

public class ProdutoRepositorio {
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
	
	public Produto getPedido(int numero) {
		return manager.find(Pedido.class, numero);
	}
	
	public List<Pedido> getPedidos() {
		TypedQuery<Pedido> query = manager.createQuery("select p from Pedido p", Pedido.class);
		return query.getResultList();
	}

}
