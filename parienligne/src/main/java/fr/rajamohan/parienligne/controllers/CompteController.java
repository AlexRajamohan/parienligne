package fr.rajamohan.parienligne.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.rajamohan.parienligne.Entity.Compte;
import fr.rajamohan.parienligne.Services.CompteService;

@Controller
public class CompteController {
	//permet d’injecter des service (et des dao) dans d’autre classe sans les instancier.
	@Autowired
	private CompteService compteService;

	
	@RequestMapping(value = "/compte/allCompte", method = RequestMethod.GET)
    public String allCompte(final ModelMap pModel) {
    	List<Compte> test = compteService.getAll();
        return "bonjour";
    }
	//recuperer un compte par son login
	// http://localhost:8080/parienligne/compte?login=alex.raja
	@RequestMapping(value = "/compte", method = RequestMethod.GET)
    public String allCompte(final ModelMap pModel, @RequestParam(value="login") final String login) {
    	Compte currentCompte = compteService.getCompteByLogin(login);
        return "bonjour";
    }
	
	

	
	
//	@RequestMapping(value="/creerCompte", method = RequestMethod.POST)
//    public String creer(@Valid /*@ModelAttribute(value="creation")*/ final CreationForm pCreation, 
//            final BindingResult pBindingResult, final ModelMap pModel) {
//
//        if (!pBindingResult.hasErrors()) {
//  //          final Integer lIntQuantite = Integer.valueOf(pCreation.getQuantite());
//             compteService.creerCompte(pCreation.getEmail(), pCreation.getLogin(), pCreation.getMotDepasse());
//        }
//        	return "bonjour";
//    }

}
