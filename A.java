/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package princi;

/**
 *
 * @author yayit
 */
public class A {
    int i;
    
}

class B extends A{
    int i;
    
    //hace su constructor, con el atributo que hereda y el propio
    B(int a, int b){
        //hace referencia a la subclase
        i=a;
        //hace referencia a la superclase que tenga el valor de a que le acabamos de poner a "a" de la subclase
        super.i=a;
        //hace referencia la variable heredada de la superclase pero estando en la subclase
        i=b;
    }
    
    void mostrar(){
        //estando en la clase hereda para acceder al atributo de una super clase así se manda a llamar super.(nombre del atributo)
        System.out.println("i de la superclase: "+super.i);
        //como está en la subclase no hay necesidad de hacer lo anterior pero con sub
        System.out.println("i de la subclase: "+i);
    }
}

