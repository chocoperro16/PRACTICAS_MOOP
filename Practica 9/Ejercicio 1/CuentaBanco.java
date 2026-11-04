package Practica9;

public class CuentaBanco {
    private String titular;
    private double saldo;

    public CuentaBanco(String titular, double saldo) {
        setTitular(titular);   
        setSaldo(saldo);
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo; 
    }

    public void setTitular(String titular) {
        if (titular != null && !titular.isBlank()) {
            this.titular = titular;
        } else {
            System.out.println("Nombre inexistente");
        }
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("No se aceptan saldos negativos, su saldo es de: " + this.saldo);
        }
    }

    @Override
    public String toString() {
        return titular + " | saldo $" + saldo;
    }
}