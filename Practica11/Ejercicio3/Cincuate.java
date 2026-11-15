package Practica11.Ejercicio3;

public class Cincuate implements Animal, Reptil {
    private String nombre;
    private String habitad;

    public Cincuate(String nombre, String habitad) {
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
    public void tipoEscamas() {
        System.out.println("El cincuate tiene piel escamosa y rugosa");
    }

    @Override 
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre+", Hábitat: " + habitad);
        System.out.println("Tipo de escamas: ");
        tipoEscamas();
    }
    
}
