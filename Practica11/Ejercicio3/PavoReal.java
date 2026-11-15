package Practica11.Ejercicio3;

public class PavoReal implements Animal, Ave {
    private String nombre;
    private String habitad;

    public PavoReal(String nombre, String habitad) {
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
        System.out.println("El pavo real tiene plumas largas y coloridas");
    }

    @Override 
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre+", Hábitat: " + habitad);
        System.out.println("Tipo de plumas: ");
        tipoPlumas();
    }
    
}
