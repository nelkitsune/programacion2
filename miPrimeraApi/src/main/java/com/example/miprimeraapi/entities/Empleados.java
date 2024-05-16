package com.example.miprimeraapi.entities;

import com.example.miPrimeraApi.entities.enums.TipoEmpleado;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Entity
@Table(name = "empleados")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Empleado extends Persona implements Serializable{

}
