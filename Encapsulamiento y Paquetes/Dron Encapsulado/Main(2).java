public class Main {
    public static void main(String[] args) {

        Dron miDron = new Dron();

        miDron.setModelo("DJI Mini");
        miDron.setBateria(80);
        miDron.setAltura(0);

        System.out.println("Modelo: " + miDron.getModelo());
        System.out.println("Bateria: " + miDron.getBateria() + "%");
        System.out.println("Altura: " + miDron.getAltura() + " m");

        miDron.despegar();
        miDron.aterrizar();

        miDron.setBateria(15);
        miDron.despegar();

        miDron.bateria = 500;
    }
}
