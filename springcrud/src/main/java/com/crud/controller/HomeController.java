package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ssh5.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crud.domain.Person;
import com.crud.service.PersonService;

@Controller
public class HomeController {
	
	@Autowired
	private PersonService personService;
	
	
	@RequestMapping("/")
	public String home(@ModelAttribute Person person) {
		return "hello";
	}

	@RequestMapping(value = "/personform", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute Person person) {
		System.out.println(person);
		personService.save(person);
		return "redirect:/";
	}

}


