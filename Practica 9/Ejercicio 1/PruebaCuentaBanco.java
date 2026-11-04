package Practica9;

public class PruebaCuentaBanco {
    public static void main(String[] args) {
        CuentaBanco cuenta = new CuentaBanco("Sebastian", 1000.0);
        System.out.println(cuenta);

        cuenta.setTitular("Daniel");
        System.out.println(cuenta);

        cuenta.setSaldo(500.0);
        System.out.println(cuenta);

        /* 
        cuenta.setSaldo(-200.0); 
        System.out.println(cuenta);/* 


        /* 
        System.out.println("Cambiar el titular a null: ");
        cuenta.setTitular(null);
        System.out.println(cuenta);

        System.out.println("Cambiar el titular a solo espacios: ");
        cuenta.setTitular("  ");
        System.out.println(cuenta);

        System.out.println("Cambiar el titular a una cadena vacía: ");
        cuenta.setTitular("");
        System.out.println(cuenta);


        cuenta.setSaldo(500.0); 
        System.out.println(cuenta); */
    }
}
