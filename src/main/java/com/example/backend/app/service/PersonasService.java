package com.example.backend.app.service;

import com.example.backend.app.data.entity.Persona;
import com.example.backend.app.facade.PersonasFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonasService {
    PersonasFacade personasFacade;

    @Autowired
    public PersonasService(PersonasFacade personasFacade) {
        this.personasFacade = personasFacade;
    }

    public List<Persona> findByName(String name){
        return personasFacade.findByName(name);
    }
}
