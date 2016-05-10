package fr.rajamohan.parienligne.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.rajamohan.parienligne.Dao.CompteDao;
import fr.rajamohan.parienligne.Entity.Compte;

@Service
public class CompteService {

	@Autowired
	private CompteDao compteDao;

	public List<Compte> getAll() {
		return this.compteDao.getAllCompte();
	}

	public Compte getCompteByLogin(String login) {
		// TODO Auto-generated method stub
		return compteDao.getCompteByLogin(login);
	}

//	@Transactional
//	public void creerCompte(String email, String login, String motDePasse){
//		final Compte compteAlex= new Compte();
//	//	lCompte.setCompteId(Id);
//		compteAlex.setEmail(email);
//		compteAlex.setLogin(login);
//		compteAlex.setMotDePasse(motDePasse);
//	//	lCompte.setTypeDeCompte(typeDeCompte);
//
//		compteDao.creerCompte(compteAlex);	
//	}
}
