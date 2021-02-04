package org.trabLanchonete.lanchonete.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.trabLanchonete.lanchonete.model.Ingrediente;

@Repository
public class IngredienteRepositorio {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void cadastrar(Ingrediente ingrediente) {
		manager.persist(ingrediente);
	}
	
	public Ingrediente getIngrediente(int numero) {
		Query query = manager.createQuery("select f from ingrediente f where f.numero = ?1");
		query.setParameter(1, numero);
		try {
			return (Ingrediente) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	public List<Ingrediente> getIngredientes() {
		TypedQuery<Ingrediente> query = manager.createQuery("select l from ingrediente l", Ingrediente.class);
		return query.getResultList();
	}
}

	
	