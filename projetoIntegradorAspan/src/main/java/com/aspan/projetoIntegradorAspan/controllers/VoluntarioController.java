package com.aspan.projetoIntegradorAspan.controllers;

import com.aspan.projetoIntegradorAspan.models.Voluntario;
import com.aspan.projetoIntegradorAspan.services.VoluntarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/voluntario")
public class VoluntarioController {

    @Autowired
    VoluntarioService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Voluntario> create(@RequestBody Voluntario voluntario){
        Voluntario voluntarioCreated = service.create(voluntario);

        return ResponseEntity.status(201).body(voluntarioCreated);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Voluntario> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Voluntario> findById(@PathVariable Long id){
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}