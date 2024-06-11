/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

/**
 *
 * @author yayit
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestC ob=new TestC();
        int a=15;
        int b=20;
        System.out.println("a y b antes: "+a +" "+b);
        
        ob.metodo(a, b);
        
        System.out.println("a y b despues: "+a+" "+b);
    }
    
}
