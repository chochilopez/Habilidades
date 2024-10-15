package com.pildoras.spring.beans;

import com.pildoras.spring.CreacionInformes;
import com.pildoras.spring.Empleado;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(value ="jefe")
public class JefeEmpleado  implements Empleado {
    //Creaccion de la propiedad de tipo CreacionInforme(Interfaz)
    private CreacionInformes informe;

    @Override
    public String getTareas() {
        return "Realizar el seguimiento de los empleados y la toma de decisiones";
    }

    @Override
    public String getInformes() {
        return "Informe creado por el jefe: " + informe.getInforme();
    }
}
