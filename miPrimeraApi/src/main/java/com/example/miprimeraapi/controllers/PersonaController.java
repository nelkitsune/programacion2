package com.example.miprimeraapi.controllers;

import com.example.miprimeraapi.entities.Persona;
import com.example.miprimeraapi.services.PersonaSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private PersonaSevice personaSevice;

    @PostMapping("/personas")//localhost:3000/personas (POST)

    public Persona crearPersona (@RequestBody Persona persona){
        return personaSevice.crearPersona(persona);
    }

    @GetMapping("/personas/{id}") //localhost:3000/personas/1 (GET)
    public Persona buscarPersonaPorId (@PathVariable Long id){
        return personaSevice.buscarPersonaPorId(id);
    }

    @GetMapping("/personas") //localhost:3000/personas (GET)
    public List<Persona> listarPersonas(){
        return personaSevice.listaPersonas();
    }

    @PutMapping("/personas")
    public Persona actualizarPersona (@RequestBody Persona persona){
        return personaSevice.actualizarPersona(persona);
    }

    @DeleteMapping( "/personas/{id}")//localhost:3000/personas/1 (Delete)
    public void  eliminarPersona(@PathVariable Long id){
        personaSevice.eliminarPersona(id);
    }

}
