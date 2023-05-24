package com.aspan.projetoIntegradorAspan.repositories;

import com.aspan.projetoIntegradorAspan.models.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario,Long> {
}
