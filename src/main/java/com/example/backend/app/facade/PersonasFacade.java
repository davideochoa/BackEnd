package com.example.backend.app.facade;

import com.example.backend.app.data.entity.Persona;
import com.example.backend.app.data.repository.PersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonasFacade {

    private PersonasRepository personasRepository;

    @Autowired
    public PersonasFacade(PersonasRepository personasRepository) {
        this.personasRepository = personasRepository;
    }

    public List<Persona> findByName(String name){
        return personasRepository.findByName(name);
    }
}
