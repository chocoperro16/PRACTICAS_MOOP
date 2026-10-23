package com.arena.app;

import com.arena.armas.Arma;

public class Escopeta extends Arma {

    public void recargar() {
        this.cargador = 8;
        setMunicion(cargador);
        System.out.println(nombre + " recargada: " + cargador + " balas");
        this.danioBase = 50;
    }
}
