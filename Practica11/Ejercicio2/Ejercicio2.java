/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2;

/**
 *
 * @author gaelv
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        // ==================================
        // PRUEBAS DE AUTOMOVIL
        // ==================================

        System.out.println("========== PRUEBAS DE AUTOMOVIL ==========\n");

        Transporte[] automoviles = {
            new Automovil(100, 2),
            new Automovil(100, 5),
            new Automovil(100, 10),
            new Automovil(50, 6)
        };

        for (int i = 0; i < automoviles.length; i++) {
            System.out.println("Prueba " + (i + 1));
            System.out.println("Combustible inicial: "
                    + automoviles[i].getCombustible() + "%");
            System.out.println("Kilometros: "
                    + automoviles[i].getKilometros());

            automoviles[i].consumoCombustible();

            System.out.println("\n");
        }


        // ==================================
        // PRUEBAS DE AUTOBUS
        // ==================================

        System.out.println("========== PRUEBAS DE AUTOBUS ==========\n");

        Transporte[] autobuses = {
            new Autobus(100, 1),
            new Autobus(100, 3),
            new Autobus(100, 5),
            new Autobus(50, 3)
        };

        for (int i = 0; i < autobuses.length; i++) {
            System.out.println("Prueba " + (i + 1));
            System.out.println("Combustible inicial: "
                    + autobuses[i].getCombustible() + "%");
            System.out.println("Kilometros: "
                    + autobuses[i].getKilometros());

            autobuses[i].consumoCombustible();

            System.out.println("\n");
        }


        // ==================================
        // PRUEBAS DE CAMION DE CARGA
        // ==================================

        System.out.println("========== PRUEBAS DE CAMION DE CARGA ==========\n");

        Transporte[] camiones = {
            new CamionCarga(100, 0, 2),
            new CamionCarga(100, 1, 2),
            new CamionCarga(100, 100, 2),
            new CamionCarga(100, 150, 2),
            new CamionCarga(100, 151, 2),
            new CamionCarga(100, 200, 5)
        };

        for (int i = 0; i < camiones.length; i++) {
            System.out.println("Prueba " + (i + 1));
            System.out.println("Combustible inicial: "
                    + camiones[i].getCombustible() + "%");
            System.out.println("Kilometros: "
                    + camiones[i].getKilometros());

            System.out.print("Resultado: ");

            camiones[i].consumoCombustible();

            System.out.println("\n");
        }

    }

}
