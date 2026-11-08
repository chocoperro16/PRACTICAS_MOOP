package Practica10.Ejercicio2;

public class Ingeniero extends Empleado{
    private double horasExtra;
    private double pagoEspecialidad;

    public Ingeniero(String nombre, double salario, double horasExtra, double pagoEspecialidad) {
        super(nombre, salario);
        this.horasExtra = horasExtra;
        this.pagoEspecialidad = pagoEspecialidad;
    }

    @Override
    public double calcularSalario(){
        if(getSalario()<=0 || horasExtra<0 || pagoEspecialidad<0){
            System.out.println("El salario o las horas extra no pueden ser negativos");
            return 0;
        }
        return getSalario() + (horasExtra * pagoEspecialidad ); 
    }





    
}
