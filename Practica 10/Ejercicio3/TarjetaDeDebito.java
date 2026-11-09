package Practica10.Ejercicio3;
public class TarjetaDeDebito extends MetodoPago {
    private double saldo;

    public TarjetaDeDebito(String titular, String numero, double saldo) {
        super(titular, numero);
        this.saldo = saldo;
    }

    @Override
    public double calcularComision(double monto, String dia, boolean festivo) {
        if (dia == null) {
            throw new IllegalArgumentException("El dia no puede ser nulo");
        }

        if (esFinDeSemana(dia) || festivo) {
            return 0.0;
        }

        if (esDiaLaboral(dia)) {
            return monto * 0.10;
        }

        throw new IllegalArgumentException("Dia no valido");
    }

    @Override
    public double procesarPago(double monto, String dia, boolean festivo) {
        double comision = calcularComision(monto, dia, festivo);
        double total = monto + comision;

        if (total > saldo) {
            System.out.printf("  %-8s %s | RECHAZADO: saldo insuficiente ($%.2f)%n",
                getTipo(), numero, saldo);
            return 0.0;
        }

        saldo = saldo - total;
        return mostrarPago(monto, comision);
    }

    private boolean esFinDeSemana(String dia) {
        return dia.equalsIgnoreCase("sabado") ||
               dia.equalsIgnoreCase("domingo");
    }

    private boolean esDiaLaboral(String dia) {
        return dia.equalsIgnoreCase("lunes") ||
               dia.equalsIgnoreCase("martes") ||
               dia.equalsIgnoreCase("miercoles") ||
               dia.equalsIgnoreCase("jueves") ||
               dia.equalsIgnoreCase("viernes");
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String getTipo() {
        return "Debito";
    }
}