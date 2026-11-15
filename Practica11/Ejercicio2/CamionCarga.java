/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg2;

/**
 *
 * @author gaelv
 */
public class CamionCarga extends Transporte{
    private double peso;
    
    public CamionCarga(double combustible, double peso, double kilometros){
        super(combustible, kilometros);
        setPeso(peso);
    }
    
    public void setPeso(double peso){
        if (peso < 0) peso = 0;
        this.peso = peso;
    }
    
    @Override
    public void consumoCombustible(){
        if (peso == 0){
            super.setCombustible(super.getCombustible()-(10*getKilometros()));
        }
        else if(peso <= 150){
            super.setCombustible(super.getCombustible()-(15*getKilometros()));
        }
        else{
            super.setCombustible(super.getCombustible()-(20*getKilometros()));
        }
        
        if (super.getCombustible() > 0){
            System.out.print("Queda el: " + getCombustible()+" % de combustible");
        }
        else{
            System.out.print("Ya no hay combustible");
        }
    }
}
