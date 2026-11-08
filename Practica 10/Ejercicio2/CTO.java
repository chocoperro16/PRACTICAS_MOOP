package Practica10.Ejercicio2;

public class CTO extends Empleado {
    private double accionesInvertidas;

    public CTO(String nombre, double salario, double accionesInvertidas) {
        super(nombre, salario);
        this.accionesInvertidas = accionesInvertidas;
    }


    @Override
    public double calcularSalario(){
        if(getSalario()<=0 || accionesInvertidas<0){
            System.out.println("El salario o las acciones invertidas no pueden ser negativos");
            return 0;
        }
        return getSalario() *   2.0 + accionesInvertidas;
    }

}
