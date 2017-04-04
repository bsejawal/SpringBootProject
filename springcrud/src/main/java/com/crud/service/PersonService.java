package com.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dao.PersonDAO;
import com.crud.domain.Person;

@Service
public class PersonService {
	
	@Autowired
	private PersonDAO personDAO;
	
	public void save(Person person){
		
		personDAO.save(person);
	}
	
	
	
	

}
