package fr.rajamohan.parienligne.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CreationPariController {

	@RequestMapping(value = "/creationpari", method = RequestMethod.GET)
	   public String index() {
		   return "creationpari";
	   }
	   
}
