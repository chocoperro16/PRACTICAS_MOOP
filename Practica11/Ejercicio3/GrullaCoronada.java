package Practica11.Ejercicio3;

public class GrullaCoronada implements Animal, Ave {
    private String nombre;
    private String habitad;

    public GrullaCoronada(String nombre, String habitad) {
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
        System.out.println("La grulla coronada tiene plumas largas y elegantes");
    }

    @Override 
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre+", Hábitat: " + habitad);
        System.out.println("Tipo de plumas: ");
        tipoPlumas();
    }
    
}
