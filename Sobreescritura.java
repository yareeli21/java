/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sobreescritura;

/**
 *
 * @author yayit
 */
public class Sobreescritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Primis uno= new Primis(5,6);
        
        Seguns dos= new Seguns(9,8,10);
        
        
        //solo imprimirá la K
        dos.mostrar();
        //solo imprimirá la i y la j
        uno.mostrar();
        
       
        
    }
    
}
