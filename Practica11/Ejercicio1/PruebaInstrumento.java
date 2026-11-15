package Practica11.Ejercicio1;

import java.util.ArrayList;

public class PruebaInstrumento {
    ArrayList<Instrumento> instrumentos = new ArrayList<>();

    public void agregarInstrumentos(Instrumento instrumento) {
        instrumentos.add(instrumento);
        System.out.println("Se agregó el instrumento: " + instrumento.getNombre());
    }

    public void eliminarInstrumento(String nombre) {
        for (int i = 0; i < instrumentos.size(); i++) {
            if (instrumentos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                instrumentos.remove(i);
                System.out.println("Se eliminó: " + nombre);
                return;
            }
        }
        System.out.println("No se encontró: " + nombre);
    }

    public static void main(String[] args) {
        PruebaInstrumento prueba = new PruebaInstrumento();

        prueba.agregarInstrumentos(new Piano("Piano", "Cuerda", "Clin Clin Clin"));
        
    
        for (Instrumento instrumento : prueba.instrumentos) {
            instrumento.hacerSonido();
        }
        for (Instrumento instrumento : prueba.instrumentos) {
            instrumento.sonidoInstrumento();
            
        } 
        
        prueba.eliminarInstrumento(null);
        prueba.eliminarInstrumento("Guitarra");
        System.out.println("------------------");
        for (Instrumento instrumento : prueba.instrumentos) {
            instrumento.hacerSonido();
        }
        
    }


}


