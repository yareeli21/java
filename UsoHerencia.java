/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usoherencia;

/**
 *
 * @author yayit
 */
public class UsoHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado e1=new Empleado("Barak Obama", 3650.45,"00001");
        Gerente g1=new Gerente("Silvio Berlusconi",2654.32,"0002","Espectaculos");
        
        //el método toString se invoca implícitamente
        System.out.println(g1);
        
        //también para gerente
        System.out.println(e1);
        
        g1.contratarPersonal();
        
        g1.cambiarSalario(542.32);
        //después del cambio del salario
        //se vuelve a invocar toString
        System.out.println(g1);
    }
    
}
