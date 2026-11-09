public class TarjetaDeDebito extends MetodoPago {
    private double saldo;

    public TarjetaDeDebito(String titular, String numero, double saldo) {
        super(titular, numero);
        this.saldo = saldo;
    }

    // 10 % de lunes a viernes; 0 % en fin de semana y dias festivos
    @Override
    public double calcularComision(double monto, String dia, boolean festivo) {
        if (esFinDeSemana(dia) || festivo) {
            return 0.0;
        }
        return monto * 0.10;
    }

    @Override
    public double procesarPago(double monto, String dia, boolean festivo) {
        double total = monto + calcularComision(monto, dia, festivo);
        if (total > saldo) {
            System.out.printf("  %-8s %s | RECHAZADO: saldo insuficiente ($%.2f)%n",
                getTipo(), numero, saldo);
            return 0.0;
        }
        saldo = saldo - total;
        return super.procesarPago(monto, dia, festivo);
    }

    private boolean esFinDeSemana(String dia) {
        return dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("domingo");
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String getTipo() {
        return "Debito";
    }
}
