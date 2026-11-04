public class Estudiante {

    // Atributos privados
    private int matricula;
    private int edad;
    private double promedio;
    private int creditos;

    // Constructor
    public Estudiante(int matricula, int edad,
                      double promedio, int creditos) {

        if (matricula > 0) {
            this.matricula = matricula;
        }

        if (edad >= 15 && edad <= 100) {
            this.edad = edad;
        }

        if (promedio >= 0 && promedio <= 10) {
            this.promedio = promedio;
        }

        if (creditos >= 0 && creditos <= 500) {
            this.creditos = creditos;
        }
    }

    // Modificar matricula
    public void cambiarMatricula(int nuevaMatricula) {
        if (nuevaMatricula > 0) {
            matricula = nuevaMatricula;
            System.out.println("Matricula actualizada");
        } else {
            System.out.println("Matricula invalida");
        }
    }

    // Modificar edad
    public void cambiarEdad(int nuevaEdad) {
        if (nuevaEdad >= 15 && nuevaEdad <= 100) {
            edad = nuevaEdad;
            System.out.println("Edad actualizada");
        } else {
            System.out.println("Edad invalida");
        }
    }

    // Modificar promedio
    public void cambiarPromedio(double nuevoPromedio) {
        if (nuevoPromedio >= 0 && nuevoPromedio <= 10) {
            promedio = nuevoPromedio;
            System.out.println("Promedio actualizado");
        } else {
            System.out.println("Promedio invalido");
        }
    }

    // Modificar creditos
    public void cambiarCreditos(int nuevosCreditos) {
        if (nuevosCreditos >= 0 && nuevosCreditos <= 500) {
            creditos = nuevosCreditos;
            System.out.println("Creditos actualizados");
        } else {
            System.out.println("Creditos invalidos");
        }
    }

    // Consultar informacion
    public void mostrarDatos() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Creditos: " + creditos);
    }
}
