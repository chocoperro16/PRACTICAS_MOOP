package Practica7;

public class Gato extends Animal {
    String raza;
    String color;
    String tamanio;

    public Gato(String nombre, String habitad, String alimentacion, boolean domestico, boolean peligroso, boolean esMamifero, boolean esVertebrado, boolean esSocial, boolean sangreCaliente, String raza, String color, String tamanio) {
        super(nombre, habitad, alimentacion, domestico, peligroso, esMamifero, esVertebrado, esSocial, sangreCaliente);
        this.raza = raza;
        this.color = color;
        this.tamanio = tamanio;
    }

    public void infoGato() {
        infoAnimal();
        System.out.println("Raza: " + raza);
        System.out.println("Color: " + color);
        System.out.println("Tamaño: " + tamanio);
    }

    public void maullar() {
        System.out.println("Miau miau");
    }

}
