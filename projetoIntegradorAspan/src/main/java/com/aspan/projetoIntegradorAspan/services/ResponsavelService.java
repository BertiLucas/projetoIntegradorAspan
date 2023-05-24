package com.aspan.projetoIntegradorAspan.services;


import com.aspan.projetoIntegradorAspan.models.Responsavel;
import com.aspan.projetoIntegradorAspan.repositories.ResponsavelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResponsavelService {

    @Autowired
    ResponsavelRepository repository;


    public Responsavel create(Responsavel familiar){
        return repository.save(familiar) ;
    }

    public List<Responsavel> findAll(){
        return repository.findAll();
    }

    public Optional<Responsavel> findById(Long id){
        return repository.findById(id);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}