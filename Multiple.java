/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiple;

/**
 *
 * @author yayit
 */
public class Multiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //se instancia un objeto de la clase hija llamada C y solo se hará lo que dice su constructor
        C c= new C();
        
        //en la salida como es de jerarquía múltiple, imprime lo que primero pide
        //después lo de la clase que se extiede y de la otra que se extiende, así sucesivamente
        //imrpime de la última visitada a la primera
        //primero constructor A, B, y al final el C
    }
    
}
