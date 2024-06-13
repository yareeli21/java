/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yayit
 */
public class UsoV {
    
    public static void main (String[] args){
        //se declaran los objetos respecto las interfaces, es decir, moto puede tener tales interfaces depende las funciones
        Motor m = new Moto();
        Motor c = new Coche();
        Vehiculo mm = new Moto();
        Vehiculo cc = new Coche();
        Vehiculo b = new Bici();
        
        System.out.println("La moto tiene un motor de " + m.estTipo("gasolina"));
        System.out.println("Potencia de " + m.estPotencia(500));
        System.out.println("La moto ha acelerado y va a " + mm.acelerar(50));
         System.out.println("La moto ha frenado y va a " + mm.frenar(20));
         
         
        
        System.out.println("La bici ha acelerado y va a " + b.acelerar(25));
         System.out.println("La bici ha frenado y va a " + b.frenar(15));
         
        System.out.println("El coche tiene un motor de " + c.estTipo("gasolina"));
        System.out.println("Potencia de " + c.estPotencia(300));
        System.out.println("El coche ha acelerado y va a " + cc.acelerar(130));
         System.out.println("La coche ha frenado y va a " + cc.frenar(90));
    }
    
}
