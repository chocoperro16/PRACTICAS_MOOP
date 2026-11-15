package Practica11.Ejercicio3;

public class CamelloBactriano implements Animal, Mamifero {
    private String nombre;
    private String habitad;

    public CamelloBactriano(String nombre, String habitad) {
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
        System.out.println("El camello bactriano tiene pelaje largo y lanoso");
    }

    @Override 
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre+", Hábitat: " + habitad);
        System.out.println("Tipo de pelo: ");
        tipoPelo();
    }
    
}
