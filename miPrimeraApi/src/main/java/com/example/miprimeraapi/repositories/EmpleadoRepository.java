package com.example.miprimeraapi.repositories;
import com.example.miprimeraapi.entities.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleados, Long> {
}
