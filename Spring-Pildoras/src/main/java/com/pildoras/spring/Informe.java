package com.pildoras.spring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Informe implements CreacionInformes {
    @Override
    public String getInforme() {
        return "Esta es la representacion de un informe.";
    }
}
