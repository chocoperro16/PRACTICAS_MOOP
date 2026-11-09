package Practica10.Ejercicio3;
public class TarjetaDeCredito extends MetodoPago {
    private double limite;
    private double deuda;

    public TarjetaDeCredito(String titular, String numero, double limite) {
        super(titular, numero);
        this.limite = limite;
        this.deuda = 0.0;
    }

    @Override
    public double calcularComision(double monto, String dia, boolean festivo) {
        return monto * 0.15;
    }

    @Override
    public double procesarPago(double monto, String dia, boolean festivo) {
        double comision = calcularComision(monto, dia, festivo);
        double total = monto + comision;

        if (deuda + total > limite) {
            System.out.printf("  %-8s %s | RECHAZADO: excede el limite ($%.2f)%n",
                getTipo(), numero, limite);
            return 0.0;
        }

        deuda = deuda + total;
        return mostrarPago(monto, comision);
    }

    public double getDeuda() {
        return deuda;
    }

    @Override
    public String getTipo() {
        return "Credito";
    }
}