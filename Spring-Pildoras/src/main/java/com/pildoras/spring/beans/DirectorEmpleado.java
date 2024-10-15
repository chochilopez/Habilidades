package com.pildoras.spring.beans;

import com.pildoras.spring.CreacionInformes;
import com.pildoras.spring.Empleado;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(value ="director")
public class DirectorEmpleado implements Empleado {
    //Creaccion de la propiedad de tipo CreacionInforme(Interfaz)
    private CreacionInformes informe;

    //Creo el constructor que reciba la propiedad CreacionInforme e inyecta la dependencia
    public DirectorEmpleado(CreacionInformes informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return "Lidera el equipo y coordina las actividades.";
    }

    @Override
    public String getInformes() {
        return "Informe creado por el director: " + informe.getInforme();
    }
}
