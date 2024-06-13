/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgextends;

import pkgextends.Animal;
import pkgextends.Animal.Perro;

/**
 *
 * @author yayit
 */
public class Extends {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //se crea una instancia Animal
        Animal animal = new Animal();
        
        //se crea la instancia Animal para crear una instancia de Perro
       //porque Perro es una subclase, primero debe existir un objeto de la superclase
       //para que con ese se cree un objeto de Perro (subclase)
        Perro miperro = animal.new Perro();
        //Perro también tiene acceso al método de la superclase
        miperro.comer();
        miperro.ladrar();
    }
    
}
