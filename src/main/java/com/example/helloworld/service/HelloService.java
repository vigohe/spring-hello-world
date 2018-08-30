package com.example.helloworld.service;

import com.example.helloworld.model.Hello;
import com.example.helloworld.model.Person;
import com.example.helloworld.repositories.PersonRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HelloService {

    private PersonRepository personRepository;

    @Autowired
    public HelloService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Hello getFromDB() {
        Hello hello = new Hello();
        hello.setName("HOLA MUNDO");
        return hello;
    }

    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    public Person getPerson(Long id) {
        Optional<Person> optionalPerson = personRepository.findById(id);
        if( optionalPerson.isPresent()) {
            return optionalPerson.get();
        }
        throw new RuntimeException("NOT FOUND");
    }
}
