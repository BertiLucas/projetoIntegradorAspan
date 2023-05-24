package com.aspan.projetoIntegradorAspan.repositories;

import com.aspan.projetoIntegradorAspan.models.Voluntario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoluntarioRepository extends JpaRepository<Voluntario,Long> {
}
