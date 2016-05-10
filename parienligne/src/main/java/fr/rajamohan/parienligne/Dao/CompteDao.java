package fr.rajamohan.parienligne.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import fr.rajamohan.parienligne.Entity.Compte;

@Repository
public class CompteDao {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Compte> getAllCompte() {
		final CriteriaBuilder lCriteriaBuilder = entityManager.getCriteriaBuilder();
		final CriteriaQuery<Compte> lCriteriaQuery = lCriteriaBuilder.createQuery(Compte.class);
		final Root<Compte> lRoot = lCriteriaQuery.from(Compte.class);
		lCriteriaQuery.select(lRoot);
		final TypedQuery<Compte> lTypedQuery = entityManager.createQuery(lCriteriaQuery);

		return lTypedQuery.getResultList();
	}

	public Compte getCompteByLogin(String login) {
		final CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		final CriteriaQuery<Compte> lCriteriaQuery = builder.createQuery(Compte.class);
		final Root<Compte> compteRoot = lCriteriaQuery.from(Compte.class);
		lCriteriaQuery.select(compteRoot);

		lCriteriaQuery.where(builder.equal(compteRoot.get("login"), login));


		return entityManager.createQuery(lCriteriaQuery).getSingleResult();
	}

	
//	// Enregistrement d'un nouvel utilisateur
//    public void creerCompte( Compte compteAlex){
//            entityManager.persist( compteAlex );
//        
//    }

	}
