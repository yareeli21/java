/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author yayit
 */
public class Zoo {
    
    public static void main(String args[]){
        
        Mamifero m = new Mamifero("elefante","Dumbo",900,12);
        Ave a = new Ave("aguila", "vuela vuela",20,6,"cafe",250);
        Insecto i = new Insecto("mosco","pica pica", (float) 0.20,2,true);
        
        System.out.println("Que animal soy: "+m.queAnimalEres());
        System.out.println("Especie: "+m.getEspecie());
        System.out.println("Nombre: "+m.getNombre());
        System.out.println("Peso: "+m.getPeso()+"kg");
        System.out.println("Jaula: "+m.getNumJ());
        
         System.out.println("Que animal soy: "+a.queAnimalEres());
        System.out.println("Especie: "+a.getEspecie());
        System.out.println("Nombre: "+a.getNombre());
        System.out.println("Peso: "+a.getPeso()+"kg");
        System.out.println("Jaula: "+a.getNumJ());
        System.out.println("Color: "+a.getColor());
        System.out.println("Altura: "+a.getAltura());
        
        System.out.println("Que animal soy: "+i.queAnimalEres());
        System.out.println("Especie: "+i.getEspecie());
        System.out.println("Nombre: "+i.getNombre());
        System.out.println("Peso: "+i.getPeso()+"kg");
        System.out.println("Jaula: "+i.getNumJ());
        System.out.println("¿Vuela?: "+i.getVuela());
        if(i.getVuela()== true){
            System.out.println("Si vuela");
        }
        else{
            System.out.println("No vuela");
        }
       
        
        
    }
}
