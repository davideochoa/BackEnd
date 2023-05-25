package com.example.backend.app.data.DTO;

import com.example.backend.app.data.entity.Persona;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class PersonaDTO implements Serializable {
    private Long id;

    private String nombre;

    private String userName;

    public PersonaDTO(Persona persona) {
        if(persona.getId() != null)
            setId(persona.getId());
        else
            setId(null);
        setNombre(persona.getNombre());
        setUserName(persona.getUserName());
    }
}
