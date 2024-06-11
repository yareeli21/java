/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author yayit
 */
public class DemoStatic {
    static int a = 42;
    static int b = 99;
    
    static{
        System.out.println("cargando clase...");
        b=a*4;
    }
    static void llamada(){
        System.out.println("a = "+ a);
    }
}
