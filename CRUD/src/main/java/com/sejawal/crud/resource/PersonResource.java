package com.sejawal.crud.resource;

import com.sejawal.crud.model.Person;
import com.sejawal.crud.repository.PersonRepository;
import com.sejawal.crud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonResource {

    @Autowired
    PersonService personService;
    // this example's reference is
//https://spring.io/guides/tutorials/bookmarks/
    private final PersonRepository personRepository;

    PersonResource(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @GetMapping(value = "/persons")
    public List<Person> all(){
        return (List<Person>) personRepository.findAll();
    }
    @GetMapping(value = "/person/{id}")
    public Person one(@PathVariable(value="id") Long id){
        return personRepository.findById(id).orElse(null);
    }

    //person?name=bhesh
    @GetMapping(value = "/person")
    public Person person(@RequestParam(value="name") String name){
        return personRepository.findByName(name).orElse(null);
    }
    @PutMapping(value = "/person/{id}")
    public Person replacePerson(@RequestBody Person newPerson, @PathVariable(value = "id") Long id){
        return personRepository.findById(id)
                .map(person -> {
                    person.setAddress(newPerson.getAddress());
                    person.setName(newPerson.getName());
                    person.setEmail(newPerson.getEmail());
                    return personRepository.save(newPerson);
                }).orElseGet(() -> {
                    newPerson.setId(id);
                    return personRepository.save(newPerson);
                });
    }
    @DeleteMapping(value = "/person/{id}")
    public void delete(@PathVariable(name = "id") Long id){
        personRepository.deleteById(id);
    }

    @PostMapping(value = "/person")
    public Person newPerson(@RequestBody Person person){
        personRepository.save(person);
        return person;

    }
    @RequestMapping(value = "/test")
    public String test(){
        return "test Working!! ";
    }
}
