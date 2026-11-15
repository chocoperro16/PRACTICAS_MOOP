package Practica11.Ejercicio3;

public class Cuervo implements Animal, Ave {
    private String nombre;
    private String habitad;

    public Cuervo(String nombre, String habitad) {
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
    public void tipoPlumas() {
        System.out.println("El cuervo tiene plumas negras y brillantes");
    }

    @Override 
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre+", Hábitat: " + habitad);
        System.out.println("Tipo de plumas: ");
        tipoPlumas();
    }
    
}
