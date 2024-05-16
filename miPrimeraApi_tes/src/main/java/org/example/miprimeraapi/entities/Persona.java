package org.example.miprimeraapi.entities;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.StandardException;

import java.io.Serializable;

@Entity
@Table(name="persona")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="dni")
    private int dni;
}
