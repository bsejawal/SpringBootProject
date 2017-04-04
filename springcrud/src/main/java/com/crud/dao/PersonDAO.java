package com.crud.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.domain.Person;

@Repository
public interface PersonDAO extends CrudRepository<Person, String> {

}
