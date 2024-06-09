/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yayit
 */
//declaración de la clase
public class Complejo {
    //los atributos de Complejo
    private int re;
    private int im;
    //sus constructores
   Complejo(){
       re=1;
       im=1;
   } 
   //segundo constructor
   //tiene como parámetros variables con otro nombre y en el cuerpo la variable principal (la de los atributos de la clase) se iguala a las que tenemos en los parámetros
   Complejo(int r, int i){
       re=r;
       im=i;
   }
   //tercer constructor
   //se entra a una variable tipo complejo para entra a re e im.
   Complejo(Complejo var){
       re=var.re;
       im=var.im;
   }
   //definición de los métodos sumar y restar
   //con una sola variable de var
   void sumar(Complejo var){
       re=re + var.re;
       im=im +var.im;
   }
   void sumar(Complejo v1, Complejo v2){
       re= v1.re + v2.re;
       im= v1.im + v2.im;
   }
   void restar(Complejo var){
       re= re - var.re;
       im= im - var.im;
   }
    void restar(Complejo v1, Complejo v2){
       re= v1.re - v2.re;
       im= v1.im - v2.im;
   }
    
   //método para imprimir
    //se pone entre comidas el texto a desplejar y con un + para como llamar al paquete
    void imprimir(){
        System.out.println("re="+ re +"  "+ "im ="+im);
    }
    
}
