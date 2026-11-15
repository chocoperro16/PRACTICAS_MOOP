package Practica11.Ejercicio3;

public class OsoNegro implements Animal, Mamifero {
    private String nombre;
    private String habitad;

    public OsoNegro(String nombre, String habitad) {
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
        System.out.println("El oso negro tiene pelaje denso y áspero");
    }

    @Override 
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre+", Hábitat: " + habitad);
        System.out.println("Tipo de pelo: ");
        tipoPelo();
    }
    
}
