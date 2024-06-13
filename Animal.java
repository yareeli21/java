/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgextends;

/**
 *
 * @author yayit
 */
public class Animal {
    
    void comer(){
        System.out.println("el animal esta comiendo");
    }
    
    class Perro extends Animal{
        
        //el método que se le agregó para perro
        void ladrar(){
            System.out.println("El perro esta ladrando");
        }
        
    }
    
}
