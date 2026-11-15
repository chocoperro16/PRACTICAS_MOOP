/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg2;

/**
 *
 * @author gaelv
 */
public abstract class Transporte {
    private double kilometros;
    private double combustible;
    
    public Transporte(double combustible, double kilometros){
        setCombustible(combustible);
        setKilometros(kilometros);
    }
    
    public abstract void consumoCombustible();
    
    public void setKilometros(double kilometros){
        if (kilometros < 0) kilometros = 0;
        this.kilometros = kilometros;
    }
    
    public double getKilometros(){
        return kilometros;
    }
    
    public double getCombustible(){
        return combustible;
    }
    
    public void setCombustible(double combustible){
        if (combustible < 0) combustible = 0;
        if (combustible > 100) combustible = 100;
        this.combustible = combustible;
    }
}
