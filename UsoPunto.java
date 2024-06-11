/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puntito;

/**
 *
 * @author yayit
 */
public class UsoPunto {
    
    public static void main(String[] args){
        //crear objetos
        Punto p1= new Punto(5.0,9.0);
        Punto p2= new Punto(2.4,6.77);
        
        //antes de cambiar los valores
        System.out.println(p1.x+" , "+p1.y);
        //se entra a los atributos
        p1.x=5.2;
        p1.y=9.4;
        
        //Después de darles cambio
        System.out.println(p1.x+" , "+p1.y);
        
        //mandar a llamar el método
        double d=p1.calcularDistancia();
        System.out.println("distancia: "+d);
        
        //manda a llamar el método de tipo Punto
        
        Punto masLejano=p1.elPuntoMasLejano(p2);
        System.out.println("Coordenadas del punto mas lejano:\n"+masLejano.x+" , "+masLejano.y);
        
    }
}
