package Practica10.Ejercicio3;
public class MetodoPago {
    protected String titular;
    protected String numero;

    public MetodoPago(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public double calcularComision(double monto, String dia, boolean festivo) {
        return 0.0;
    }

    public double procesarPago(double monto, String dia, boolean festivo) {
        double comision = calcularComision(monto, dia, festivo);
        return mostrarPago(monto, comision);
    }

    protected double mostrarPago(double monto, double comision) {
        double total = monto + comision;

        System.out.printf("  %-8s %s | monto $%.2f + comision $%.2f = $%.2f%n",
            getTipo(), numero, monto, comision, total);

        return total;
    }

    public String getTipo() {
        return "Pago";
    }

    @Override
    public String toString() {
        return getTipo() + " " + numero + " de " + titular;
    }
}