package Practica10.Ejercicio1;
public class Triangulo extends Poligono {
    double base;
    double altura;

    public Triangulo(double base, double altura) {
        super("Triángulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        if (base <= 0 || altura <= 0) {
            System.out.println("No existe areas negativas");
            return 0;
        }
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
        return area;
    }
    
}
