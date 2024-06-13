/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author yayit
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //se instancia un objeto llamado superOb de la superclase
        Hereda superOb = new Hereda();
        //se instancia un objeto llamado subOb de la subclase
        B subOb = new B();
        //se le da valores a los valores de la superclase
        superOb.i=10;
        superOb.j=20;
        
       //imprime los valores de la superclase
        System.out.println("superOb: ");
        //ocupa su método de la superclase
        superOb.mostrarij();
        //despliega un espacio para mejor orden
        System.out.println();
         
        //se le da valores a i,j y k, como es una subclase también hereda la i y j de la superclase de la cual es heredada
        subOb.i=7;
        subOb.j=8;
        subOb.k=9;
        
       System.out.println("subOb: ");
       //imprime los dos métodos pero en función de la subclase
        subOb.mostrarij();
        subOb.mostrark();
        System.out.println();
        
        System.out.println("Suma en subOb: ");
        subOb.sum();
        
        //para ver si cambbian los valores de los atributos en la superclase después de darles otro valor en la subclase
        superOb.mostrarij();
        System.out.println();
        //pues no, no cambian los valoress en la superclase, se quedan como ya se habían definido
    }
    
}
