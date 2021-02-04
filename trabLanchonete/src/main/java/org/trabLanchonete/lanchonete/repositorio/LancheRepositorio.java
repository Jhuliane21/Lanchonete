package org.trabLanchonete.lanchonete.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.trabLanchonete.lanchonete.model.Lanche;

@Repository
public class LancheRepositorio {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void cadastrar(Lanche lanche) {
		manager.persist(lanche);
	}
	
	public Lanche getFornecedor(int numero) {
		Query query = manager.createQuery("select f from lanche f where f.numero = ?1");
		query.setParameter(1, numero);
		try {
			return (Lanche) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
}
