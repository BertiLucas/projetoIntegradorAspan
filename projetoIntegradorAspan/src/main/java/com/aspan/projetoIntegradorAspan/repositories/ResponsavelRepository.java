package com.aspan.projetoIntegradorAspan.repositories;

import com.aspan.projetoIntegradorAspan.models.Responsavel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsavelRepository extends JpaRepository<Responsavel,Long> {

}