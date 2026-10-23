package com.arena.leyendas;

import com.arena.armas.Arma;

public class Leyenda {

    private Arma arma;

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void disparar() {
        if (arma.getMunicion() > 0) {
            arma.setMunicion(arma.getMunicion() - 1);
            System.out.println("Leyenda dispara con " + arma.nombre + ". Municion: " + arma.getMunicion());
        } else {
            System.out.println("Sin municion");
        }
    }
}
