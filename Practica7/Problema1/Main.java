package Practica7;

public class Main {
    public static void main(String[] args) {
        Gato Queen = new Gato("Queen", "Casa", "Carnivoro", true, false, true, true, true, true, "Persa", "Blanco", "Mediano");
        Queen.infoGato();
        Queen.maullar();
        Queen.comer();
        Queen.dormir();
    }
}
