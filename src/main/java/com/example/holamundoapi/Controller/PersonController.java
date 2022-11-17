package com.example.holamundoapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.holamundoapi.model.Person;
import com.example.holamundoapi.repository.PersonRepository;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class PersonController {

    @Autowired
    private PersonRepository repository;


    @GetMapping("/persons")
    public List<Person> allPersons(){
        return repository.findAll();
    }

    @GetMapping("/person/{nombre}")
    public List<Person> findByNombre(@PathVariable("nombre") String nombre) {
        return repository.findByNombre(nombre);
    }

    @PostMapping("/person")
    public Person createPerson(@RequestBody Person person) {
        return repository.save(person);
    }

    @PutMapping("/person/{id}")
    public Person updatePerson(@PathVariable int id ,@RequestBody Person person) {
        return repository.save(person);
    }

    @DeleteMapping("/person/{id}")
    public void deletePerson(@PathVariable("id") Long id) {
        repository.deleteById(id);
    }
}

