package org.trabLanchonete.lanchonete.repositorio;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import javax.persistence.TypedQuery;


import org.springframework.stereotype.Repository;
import org.trabLanchonete.lanchonete.model.Lanche;

@Repository
public class LancheRepositorio {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void cadastrar(Lanche lanche) {
		manager.persist(lanche);
	}
	

	public Lanche getLanche(int numero) {
		Query query = manager.createQuery("select f from lanche f where f.numero = ?1");
		query.setParameter(1, numero);
		try {
			return (Lanche) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}	

	
	public List<Lanche> getLanches() {
		TypedQuery<Lanche> query = manager.createQuery("select l from lanche l", Lanche.class);
		return query.getResultList();
	}
	
	public void excluir(Lanche lanche) {
		manager.remove(lanche);
	}
	
	public Lanche getLanches(int codigo) {
		return manager.find(Lanche.class, codigo);
	}

}
