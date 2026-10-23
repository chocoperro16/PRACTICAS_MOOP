package com.arena.armas;

public class Arma {

    public String nombre;
    protected int cargador;
    int danioBase;
    private int municion;

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        if (municion >= 0) {
            this.municion = municion;
        } else {
            System.out.println("Municion invalida: " + municion);
        }
    }
}
