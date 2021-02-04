package org.trabLanchonete.lanchonete.repositorio;
<<<<<<< Upstream, based on origin/Rebeca
=======

import java.util.List;
>>>>>>> ed0752c correções no model e repositorio

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
<<<<<<< Upstream, based on origin/Rebeca
=======
import javax.persistence.TypedQuery;
>>>>>>> ed0752c correções no model e repositorio

import org.springframework.stereotype.Repository;
import org.trabLanchonete.lanchonete.model.Lanche;

@Repository
public class LancheRepositorio {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void cadastrar(Lanche lanche) {
		manager.persist(lanche);
	}
	
<<<<<<< Upstream, based on origin/Rebeca
	public Lanche getFornecedor(int numero) {
		Query query = manager.createQuery("select f from lanche f where f.numero = ?1");
		query.setParameter(1, numero);
		try {
			return (Lanche) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
=======
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
>>>>>>> ed0752c correções no model e repositorio
	}
<<<<<<< Upstream, based on origin/Rebeca
=======
	
	public void excluir(Lanche lanche) {
		manager.remove(lanche);
	}
	
//	public Lanche getLancheo(int codigo) {
//		return manager.find(Lanche.class, codigo);
//	}

>>>>>>> ed0752c correções no model e repositorio
}
