/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg2;

/**
 *
 * @author gaelv
 */
public class Automovil extends Transporte{
    public Automovil(double combustible, double kilometros){
        super(combustible, kilometros);
    }
    
    @Override
    public void consumoCombustible(){
        super.setCombustible(super.getCombustible()-(10*super.getKilometros()));
        if (super.getCombustible() > 0){
            System.out.print("Queda el: " + getCombustible()+" % de combustible");
        }
        else{
            System.out.print("Ya no hay combustible");
        }
    }
}
