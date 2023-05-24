package com.example.backend.app.data.repository;

import com.example.backend.app.data.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonasRepository extends CrudRepository<Persona, Long> {

    List<Persona> findByName(String name);

}
