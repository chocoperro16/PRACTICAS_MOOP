package Practica11.Ejercicio1;

public class Piano extends Instrumento {
    public Piano(String nombre, String tipo, String sonido) {
        super(nombre, tipo, sonido);
    }

    @Override 
    public void hacerSonido() {
        System.out.println(getNombre() + ": " + getTipo() + " - " + getSonido());
        
    }

    @Override 
    public void sonidoInstrumento(){

        if (getSonido().equals("Clin Clin Clin")){

            System.out.println(getNombre() + "Esta afinado");
        }
        else{
            System.out.println(getNombre() + "No esta afinado");
        }
    }
    
}
