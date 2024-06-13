/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yayit
 */
public class Bici implements Vehiculo{
   int frena=0;
    @Override
    public String frenar(int cuantof) {
        
        frena -= cuantof;
        
        
        return frena + " km"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String acelerar(int cuantoa) {
        
        frena += cuantoa;
        if(frena > VEL_MAXIMA){
            System.out.println("Exceso de velocidad");
        }
        return frena + " km"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
