package com.example.backend.remoto.repository;

import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("${ejemplo-sucursales.uri}")
public class remotoRepository {

    @GetMapping(value = "/sucursales/{id}")
    public Sucursal findById(@PathVariable("id") Long id);
}
