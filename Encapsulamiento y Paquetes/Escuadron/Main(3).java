package com.arena.app;

import com.arena.leyendas.Leyenda;

public class Main {
    public static void main(String[] args) {

        Escopeta escopeta = new Escopeta();
        escopeta.nombre = "Escopeta";
        escopeta.recargar();

        Leyenda leyenda = new Leyenda();
        leyenda.setArma(escopeta);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Disparo " + i + ": ");
            leyenda.disparar();
        }

        escopeta.cargador = 12;
        escopeta.danioBase = 30;
    }
}
