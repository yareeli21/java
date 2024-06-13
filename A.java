/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiple;

/**
 *
 * @author yayit
 */
public class A {
    //viene siendo una clase sin atributos y su constructor solo despliega un mensaje
    A(){
        System.out.println("Constructor de A\n");
    }
}
class B extends A{
    B(){
        System.out.println("Constructor de B\n");
    }
}
class C extends B{
     C(){
        System.out.println("Constructor de C\n");
    }
}