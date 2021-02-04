package org.trabLanchonete.lanchonete.repositorio;

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
	
	public Fornecedor getFornecedor(String nome) {
		Query query = manager.createQuery("select f from fornecedor f where f.nome = ?1");
		query.setParameter(1, nome);
		try {
			return (Fornecedor) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
}
