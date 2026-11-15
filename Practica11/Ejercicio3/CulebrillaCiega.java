package Practica11.Ejercicio3;

public class CulebrillaCiega implements Animal, Reptil {
    private String nombre;
    private String habitad;

    public CulebrillaCiega(String nombre, String habitad) {
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
        System.out.println("La culebrilla ciega tiene escamas suaves y brillantes");
    }

    @Override 
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre+", Hábitat: " + habitad);
        System.out.println("Tipo de escamas: ");
        tipoEscamas();
    }
    
}
