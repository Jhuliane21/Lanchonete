package org.trabLanchonete.lanchonete.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.trabLanchonete.lanchonete.model.Fornecedor;

@Repository
public class FornecedorRepositorio {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void cadastrar(Fornecedor fornecedor) {
		manager.persist(fornecedor);
	}
	
	public Lanche getFornecedor(int cod) {
		Query query = manager.createQuery("select f from fornecedor f where f.cod = ?1");
		query.setParameter(1, numero);
		try {
			return (Fornecedor) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	public List<Fornecedor> getFornecedores() {
		TypedQuery<Fornecedor> query = manager.createQuery("select l from fornecedor l", Fornecedor.class);
		return query.getResultList();
	}
	
	public void excluir(Fornecedor fornecedor) {
		manager.remove(fornecedor);
	}
	
	public Lanche getFornecedores(int codigo) {
		return manager.find(Fornecedores.class, codigo);
	}

}
}
