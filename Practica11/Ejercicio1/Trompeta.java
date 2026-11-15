package Practica11.Ejercicio1;

public class Trompeta extends Instrumento {


    public Trompeta(String nombre, String tipo, String sonido) {
        super(nombre, tipo, sonido);
    
    }
    
    @Override 
    public void hacerSonido() {
        System.out.println(getNombre() + ": " + getTipo() + " - " + getSonido());
        
    }

    @Override 
    public void sonidoInstrumento(){

        if (getSonido().equals("Tururu Tururu Tururu")){

            System.out.println(getNombre() + "Esta afinado");
        }
        else{
            System.out.println(getNombre() + "No esta afinado");
        }
    }
}
