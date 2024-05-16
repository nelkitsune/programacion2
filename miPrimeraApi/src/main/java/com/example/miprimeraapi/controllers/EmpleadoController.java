package com.example.miprimeraapi.controllers;

import com.example.miprimeraapi.entities.Empleados;
import com.example.miprimeraapi.entities.Empleados;
import com.example.miprimeraapi.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @PostMapping()
    public Empleados crearEmpleado(@RequestBody Empleados empleado){
        return empleadoService.crearEmpleado(empleado);
    }

    @GetMapping("/{id}")
    public Empleados buscarEmpleadoPorId(@PathVariable Long id){
        return empleadoService.buscarEmpleadoPorId(id);
    }

    @GetMapping()
    public List<Empleados> listarEmpleados(){
        return empleadoService.listarEmpleados();
    }

    @PutMapping()
    public Empleados actualizarEmpleado(@RequestBody Empleados empleado){
        return empleadoService.actualizarEmpleado(empleado);
    }

    @DeleteMapping("/{id}")
    public void eliminarEmpleado(@PathVariable Long id){
        empleadoService.eliminarEmpleado(id);
    }


}