package com.example.helloworld.controller;

import com.example.helloworld.model.Hello;
import com.example.helloworld.model.Person;
import com.example.helloworld.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class HelloController {


    final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    ResponseEntity<Hello> getHello() {
        Hello hello = helloService.getFromDB();
        return ResponseEntity.ok(hello);
    }

    @GetMapping("/person/{id}")
    ResponseEntity<Person> gerPerson(@PathVariable Long id) {
        Person person = helloService.getPerson(id);
        return ResponseEntity.ok(person);
    }

    @PostMapping("/person")
    ResponseEntity<Person> savePerson(@RequestBody Person person) {
        Person newPerson = helloService.savePerson(person);
        return ResponseEntity.ok(newPerson);
    }
}
