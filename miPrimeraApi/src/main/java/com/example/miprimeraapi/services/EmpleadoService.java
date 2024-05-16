package com.example.miprimeraapi.services;

import com.example.miprimeraapi.entities.Empleados;
import com.example.miprimeraapi.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public Empleados crearEmpleado(Empleados empleado){
        return empleadoRepository.save(empleado);
    }

    public Empleados buscarEmpleadoPorId(Long id){
        return empleadoRepository.findById(id).orElse(null);
    }

    public List<Empleados> listarEmpleados(){
        return empleadoRepository.findAll();
    }

    public Empleados actualizarEmpleado(Empleados empleado){
        return empleadoRepository.save(empleado);
    }

    public void eliminarEmpleado(Long id){
        empleadoRepository.deleteById(id);
    }

}
