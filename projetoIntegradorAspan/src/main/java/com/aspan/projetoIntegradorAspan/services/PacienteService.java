package com.aspan.projetoIntegradorAspan.services;

import com.aspan.projetoIntegradorAspan.models.Paciente;
import com.aspan.projetoIntegradorAspan.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    PacienteRepository repository;

    public Paciente create(Paciente interno){
        return repository.save(interno);
    }

    public List<Paciente> findAll(){
        return repository.findAll();
    }

    public Optional<Paciente> findById(Long id){
        return repository.findById(id);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

}
