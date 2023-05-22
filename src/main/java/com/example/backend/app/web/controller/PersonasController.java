package com.example.backend.app.web.controller;

import com.example.backend.app.data.entity.Persona;
import com.example.backend.app.service.PersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/personas")
public class PersonasController {
    PersonasService personasService;

    @Autowired
    public PersonasController(PersonasService personasService) {
        this.personasService = personasService;
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<Persona>> findByName(@PathVariable("name") String name){

        return ResponseEntity.ok(personasService.findByName(name));
    }

}
