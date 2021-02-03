import java.util.List;

public class LancheRepositorio {
	@PersistenceContext
	private EntityManager manager;

	public void inserir(Lanche lanche) {
		manager.persist(lanche);
	}
	
	public void atualizar(Lanche lanche) {
		manager.merge(lanche);
	}
	
	public void excluir(Lanche lanche) {
		manager.remove(lanche);
	}
	
	public Produto getLanche(int numero) {
		return manager.find(Lanche.class, numero);
	}
	
	public List<Lanche> getLanches() {
		TypedQuery<Lanche> query = manager.createQuery("select p from Lanches p", Lanche.class);
		return query.getResultList();
	}


}
