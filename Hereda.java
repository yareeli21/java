/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author yayit
 */
public class Hereda {
    //variables de la super clase
    int i,j;
    //método de la superclase
    void mostrarij(){
        System.out.println("i y j: " +i+" "+j);
    }
}
//se extiende una clase
class B extends Hereda{
    //variable de la clase hija
    int k;
    //método de la clase hija
    void mostrark(){
        System.out.println("K: "+k);
    }
    //suma de los atributos de la superclase y la subclase
    void sum(){
        //se está haciendo una suma con las variables en la parte de imprimir
        System.out.println("i+j+k: " +(i+j+k));
    }
}


