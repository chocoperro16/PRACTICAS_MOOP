package Practica10.Ejercicio1;

class Poligono {
    protected String nombre;
    

    public Poligono(String nombre) {
        this.nombre = nombre;
    }

public double calcularArea(){
    return 0;

}


    @Override
    public String toString() {
        return nombre + " Area: " + calcularArea();
    }



    
}