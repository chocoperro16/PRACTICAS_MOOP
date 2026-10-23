public class Dron {

    private String modelo;
    private int bateria;
    private int altura;

    public String getModelo() {
        return modelo;
    }

    public int getBateria() {
        return bateria;
    }

    public int getAltura() {
        return altura;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setBateria(int bateria) {
        if (bateria >= 0 && bateria <= 100) {
            this.bateria = bateria;
        } else {
            System.out.println("Bateria invalida: " + bateria);
        }
    }

    public void setAltura(int altura) {
        if (altura >= 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura invalida: " + altura);
        }
    }

    private boolean verificarBateria() {
        return bateria >= 20;
    }

    public void despegar() {
        if (verificarBateria()) {
            altura = 10;
            System.out.println(modelo + " despego. Altura: " + altura + " m");
        } else {
            System.out.println(modelo + " no puede despegar: bateria menor a 20%");
        }
    }

    public void aterrizar() {
        altura = 0;
        System.out.println(modelo + " aterrizo.");
    }
}
