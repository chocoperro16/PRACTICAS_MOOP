package Practica11.Ejercicio1;

public class Instrumento {
    private String nombre;
    private String tipo;
    private String sonido;

    public Instrumento(String nombre, String tipo, String sonido) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.sonido = sonido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
    public String getSonido() {
        return sonido;
    }

    
    public void hacerSonido() {
        System.out.println( nombre + ":"+ tipo + " - " + sonido);

    }

    public void sonidoInstrumento(){

    } 
    


}