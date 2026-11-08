package Practica10.Ejercicio1;

public class Circulo extends Poligono {
    double radio;

    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        if (radio <= 0) {
            System.out.println("No existe areas negativas");
            return 0;
        }

        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
        return area;
    }

}