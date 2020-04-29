package com.sejawal.crud;

import com.sejawal.crud.model.Person;
import com.sejawal.crud.repository.PersonRepository;
import com.sejawal.crud.utils.DataUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Bean
	CommandLineRunner init (PersonRepository personRepository){
		return args -> {
			List<Person> persons=DataUtils.persons();
			persons.forEach(person -> personRepository.save(person));
		};
	}
}
