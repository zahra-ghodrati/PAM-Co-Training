package com.pamco.demo.service;

import com.pamco.demo.model.PersonModel;
import com.pamco.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<PersonModel> findPersons() {
        return personRepository.findAll();
    }
}
