package com.aspan.projetoIntegradorAspan.services;

import com.aspan.projetoIntegradorAspan.models.Funcionario;
import com.aspan.projetoIntegradorAspan.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    FuncionarioRepository repository;

    public Funcionario create(Funcionario funcionario){
        return repository.save(funcionario) ;
    }

    public List<Funcionario> findAll(){
        return repository.findAll();
    }

    public Optional<Funcionario> findById(Long id){
        return repository.findById(id);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
