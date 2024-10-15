package com.pildoras.spring.beans;

import com.pildoras.spring.CreacionInformes;
import com.pildoras.spring.Empleado;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(value ="secretario")
public class SecretarioEmpleado implements Empleado {
    //Creaccion de la propiedad de tipo CreacionInforme(Interfaz)
    private CreacionInformes informe;

    @Override
    public String getTareas() {
        return "Realiza la agenda de los jefes.";
    }

    @Override
    public String getInformes() {
        return "Informe creado por el secretario: " + informe.getInforme();
    }
}
