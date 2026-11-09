package Practica10.Ejercicio3;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<MetodoPago> metodos = new ArrayList<>();

        metodos.add(new TarjetaDeDebito("Ana Lopez", "****1234", 5000));
        metodos.add(new TarjetaDeCredito("Luis Perez", "****5678", 5000));

        System.out.println("----- Metodos registrados -----");

        for (MetodoPago m : metodos) {
            System.out.println(m);
        }

        String[] dias = {"viernes", "sabado", "lunes"};
        boolean[] festivos = {false, false, true};

        double monto = 1000.0;
        double totalCobrado = 0;

        for (int i = 0; i < dias.length; i++) {

            System.out.println("----- Pagos de $" + monto + " el " + dias[i]
                + (festivos[i] ? " (festivo)" : "") + " -----");

            for (MetodoPago m : metodos) {
                totalCobrado += m.procesarPago(monto, dias[i], festivos[i]);
            }
        }

        System.out.printf("Total cobrado: $%.2f%n", totalCobrado);

        System.out.println("----- Estado final -----");

        for (MetodoPago m : metodos) {

            if (m instanceof TarjetaDeDebito) {
                TarjetaDeDebito d = (TarjetaDeDebito) m;

                System.out.printf("%s -> saldo restante $%.2f%n",
                    d, d.getSaldo());

            } else if (m instanceof TarjetaDeCredito) {
                TarjetaDeCredito c = (TarjetaDeCredito) m;

                System.out.printf("%s -> deuda $%.2f%n",
                    c, c.getDeuda());
            }
        }
    }
}