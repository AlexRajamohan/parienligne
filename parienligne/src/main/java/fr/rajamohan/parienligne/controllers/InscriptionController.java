package fr.rajamohan.parienligne.controllers;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InscriptionController {

	@RequestMapping(value = "/inscription", method = RequestMethod.GET)
	   public String displayInscription() {
		   return "inscription";
	   }
	
	   @RequestMapping(value = "/clickInscription", method = RequestMethod.GET)
	   public String clickInscription() {
	     
	      return "redirect:connexionPage";
	   }
	   

	   
	   @RequestMapping(value = "/connexionPage", method = RequestMethod.GET)
	   public String connexionPage () {
	     
	      return "connexion";
	   }

	   
}
