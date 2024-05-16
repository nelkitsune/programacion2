package com.example.miprimeraapi.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
@Entity
@Table(name = "personas")
@Data

public class Persona implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre_persona")
    protected String nombre;

    @Column(name = "apellido_persona")
    protected String apellido;

    @Column(name = "telefono")
    protected String telefono;

    @Column(name = "email")
    protected String email;

    @Column(name = "fecha_Nacimiento")
    protected LocalDate fechaDeNacimiento;
}
