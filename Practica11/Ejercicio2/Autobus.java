/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg2;

/**
 *
 * @author gaelv
 */
public class Autobus extends Transporte{
    public Autobus(double combustible, double kilometros){
        super(combustible, kilometros);
    }
    
    @Override
    public void consumoCombustible(){
        super.setCombustible(super.getCombustible()-(20*getKilometros()));
        if (super.getCombustible() > 0){
            System.out.print("Queda el: " + getCombustible()+" % de combustible");
        }
        else{
            System.out.print("Ya no hay combustible");
        }
    }
}
