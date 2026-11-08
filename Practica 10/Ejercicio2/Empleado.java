package Practica10.Ejercicio2;

public class Empleado {
    
    private  String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }


    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public double calcularSalario() {
        if (getSalario() <= 0) {
            System.out.println("El salario no puede ser negativo");
            return 0;
        }
        return salario;
    }

    @Override 
    public String toString(){
    return "Nombre: " + nombre + ", Salario: " + salario;

    }


}
