package fr.rajamohan.parienligne.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BonjourController {

	//http://localhost:8080/parienligne/bonjour
    @RequestMapping(value = "/bonjour", method = RequestMethod.GET)
    public String afficherBonjour(final ModelMap pModel) {
    	pModel.addAttribute("personne", "Alex");
    	//pModel.addAttribute("personne2", "Alexia");
        return "bonjour";
    }
    //http://localhost:8080/parienligne/bonjour2?personne=spring
    @RequestMapping(value = "/bonjour2",method = RequestMethod.GET)
    public String afficherBonjour2(final ModelMap pModel,@RequestParam(value="personne") final String pPersonne) {

        pModel.addAttribute("personne", pPersonne);
        return "bonjour";
    }
    
    //http://localhost:8080/parienligne/bonjour3/cequejeveux
    @RequestMapping(value = "/bonjour3/{personne}",method = RequestMethod.GET)
    public String afficherBonjour3(final ModelMap pModel,@PathVariable(value="personne") final String pPersonne) {

    pModel.addAttribute("personne", pPersonne);
    return "bonjour";
    }
    
    @RequestMapping(value = "/bonjourRavi", method = RequestMethod.GET)
    public String afficherBonjourRavi(final ModelMap pModel) {
        pModel.addAttribute("personne", "Ravi");
        return "bonjour";
    }
    
    
}  