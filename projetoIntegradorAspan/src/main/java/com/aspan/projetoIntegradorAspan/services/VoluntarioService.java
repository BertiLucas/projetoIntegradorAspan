package com.aspan.projetoIntegradorAspan.services;


import com.aspan.projetoIntegradorAspan.models.Voluntario;
import com.aspan.projetoIntegradorAspan.repositories.VoluntarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VoluntarioService {

    @Autowired
    VoluntarioRepository repository;


    public Voluntario create(Voluntario voluntario){
        return repository.save(voluntario) ;
    }

    public List<Voluntario> findAll(){
        return repository.findAll();
    }

    public Optional<Voluntario> findById(Long id){
        return repository.findById(id);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}