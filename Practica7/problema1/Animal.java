package Practica7;

public class Animal {
    String nombre;
    String habitad;
    String alimentacion;
    boolean domestico;
    boolean peligroso;
    boolean esMamifero;
    boolean esVertebrado;
    boolean esSocial;
    boolean sangreCaliente;

    public Animal(String nombre, String habitad, String alimentacion, boolean domestico, boolean peligroso, boolean esMamifero, boolean esVertebrado, boolean esSocial, boolean sangreCaliente) {
        this.nombre = nombre;
        this.habitad = habitad;
        this.alimentacion = alimentacion;
        this.domestico = domestico;
        this.peligroso = peligroso;
        this.esMamifero = esMamifero;
        this.esVertebrado = esVertebrado;
        this.esSocial = esSocial;
        this.sangreCaliente = sangreCaliente;
    }


    public void infoAnimal() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Habitat: " + habitad);
        System.out.println("Alimentacion: " + alimentacion);
        System.out.println("Domestico: " + domestico);
        System.out.println("Peligroso: " + peligroso);
        System.out.println("Es Mamifero: " + esMamifero);
        System.out.println("Es Vertebrado: " + esVertebrado);
        System.out.println("Es Social: " + esSocial);
        System.out.println("Sangre Caliente: " + sangreCaliente);
    }

    public void comer() {
        System.out.println(nombre + " esta comiendo");
    }

    public void dormir() {
        System.out.println(nombre + " esta durmiendo");
    }

}
