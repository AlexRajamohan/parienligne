package fr.rajamohan.parienligne.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ConnexionController {
	
	
	@RequestMapping(value = "/")
	   public String Connexion() {
		System.out.print("hello");
		   return "connexion";
	   }
	@RequestMapping(value = "/connexion")
	   public String displayConnexion() {
		   return "connexion";
	   }
	   
	 @RequestMapping(value = "/clickConnexion", method = RequestMethod.GET)
	   public String clickConnexion() {
	     
	      return "redirect:accueilsessionPage";
	   }
	 
	   @RequestMapping(value = "/accueilsessionPage", method = RequestMethod.GET)
	   public String accueilsessionPage () {
	     
	      return "accueilsession";
	   }
	 	
	 
	 
	   @RequestMapping(value = "/clickSinscrire", method = RequestMethod.GET)
	   public String clickSinscrire() {
	     
	      return "redirect:inscriptionPage";
	   }
	   

	   
	   @RequestMapping(value = "/inscriptionPage", method = RequestMethod.GET)
	   public String inscriptionPage () {
	     
	      return "inscription";
	   }
	   
}
