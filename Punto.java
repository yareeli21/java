/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puntito;

/**
 *
 * @author yayit
 */
public class Punto {
    //atributos
   public double x;
   public double y;
   
   //constructor
   public Punto(double a, double b){
       x=a;
       y=b;
   }
   //método
   public double calcularDistancia(){
       double z;
       z=Math.sqrt((x*x)+(y*y));//se usan los atributos y el recultado se guarda en una varible local del método y esa se regresa
       return z;
   }
   
   //método de tipo Punto
      public Punto elPuntoMasLejano(Punto c) {
        if (this.x >= c.x) {
            return this;
        } else {
            return c;
        }
    }
}

