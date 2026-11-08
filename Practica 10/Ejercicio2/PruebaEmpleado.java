package Practica10.Ejercicio2;

public class PruebaEmpleado {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 3000);
        Gerente gerente = new Gerente("Gael", 5000, 0);
        CTO cto = new CTO("Diego", 6000, 0);
        Ingeniero ingeniero = new Ingeniero("Abigail", 4000, 0, 0);

    System.out.println(empleado.toString());
    System.out.println("Salario total del empleado: " + empleado.calcularSalario());
    
    System.out.println(gerente.toString());
    System.out.println("Salario total del gerente: " + gerente.calcularSalario());

    System.out.println(ingeniero.toString());
    System.out.println("Salario total del ingeniero: " + ingeniero.calcularSalario());

    System.out.println(cto.toString());
    System.out.println("Salario total del CTO: " + cto.calcularSalario());

    
    }


}