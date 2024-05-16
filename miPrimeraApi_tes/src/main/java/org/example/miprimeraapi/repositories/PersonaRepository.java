package org.example.miprimeraapi.repositories;

import org.example.miprimeraapi.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {


}
