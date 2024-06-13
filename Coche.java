/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yayit
 */
public class Coche implements Vehiculo, Motor{
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
           return frena + " km" + "\nExceso de velocidad";
        }
        else
        return frena + " km";// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String estTipo(String cual) {
        return cual; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String estPotencia(int cuantop) {
        return cuantop + " HP"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
