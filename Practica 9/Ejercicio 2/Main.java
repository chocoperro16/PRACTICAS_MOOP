public class Main {

    public static void main(String[] args) {

        Estudiante alumno = new Estudiante(12345, 20, 8.5, 120);

        System.out.println("DATOS INICIALES");
        alumno.mostrarDatos();

        System.out.println("----------------");

        alumno.cambiarEdad(21);
        alumno.cambiarPromedio(9.2);
        alumno.cambiarCreditos(140);

        System.out.println("----------------");

        alumno.cambiarEdad(12);
        alumno.cambiarPromedio(12.5);
        alumno.cambiarCreditos(-10);

        System.out.println("----------------");
        System.out.println("DATOS FINALES");

        alumno.mostrarDatos();
    }
}
