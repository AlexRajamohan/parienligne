package fr.rajamohan.parienligne.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccueilSessionController {

	   @RequestMapping(value = "/clickInscription1", method = RequestMethod.GET)
	   public String clickInscription1() {
	     
	      return "redirect:connexionPage2";
	   }
	   

	   
	   @RequestMapping(value = "/connexionPage2", method = RequestMethod.GET)
	   public String connexionPage () {
	     
	      return "connexion";
	   }
}
