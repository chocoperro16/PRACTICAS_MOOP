package Practica11.Ejercicio3;

public class LoboCanadiense implements Animal, Mamifero {
    private String nombre;
    private String habitad;
    
    public LoboCanadiense(String nombre, String habitad) {
        this.nombre = nombre;
        this.habitad = habitad;
    }


    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getHabitad() {
        return habitad;
    
    }

    @Override
    public void tipoPelo() {
        System.out.println("El lobo canadiense tiene pelaje denso");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre+", Hábitat: " + habitad);
        System.out.println("Tipo de pelo: ");
        tipoPelo();
    
    }
}
