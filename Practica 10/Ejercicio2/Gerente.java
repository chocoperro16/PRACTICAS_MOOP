package Practica10.Ejercicio2;

public class Gerente extends Empleado {

    private double bono;

    
    public Gerente(String nombre, double salario, double bono) {
        super(nombre, salario);
        this.bono = bono;
    }

    @Override
    public double calcularSalario(){
        if(getSalario()<=0 || bono<0){
            System.out.println("El salario o el bono no pueden ser negativos");
            return 0;
        }
        return getSalario() + bono;
    }

}
