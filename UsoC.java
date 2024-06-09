/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yayit
 */
public class UsoC {
    public static void main(String[] args){
        //se crean (en la fábrica) las tres instancias (objetos) de la clase Complejo
        //usando los tres constructores
        //las variables A,B, y C son referencias a un complejo
        //El operador new genera la memoria para una instancia de la clase Complejo
        
        //el primer constructor sin argumentos
        Complejo A= new Complejo();
        
        //segundo constructor con argumentos
        Complejo B = new Complejo(5,8);

       //tercer constructor con argumento de Complejo
       Complejo C= new Complejo(B);
       
       //hacer uso de los métodos
       //del método imprimir
       //para llamar a los métodos es por medio de un punto, el objeto ya instanciado, punto y el nombre del método
       A.imprimir();
       B.imprimir();
       C.imprimir();
       
       //hacer uso de los métodos de sumas
       //sumar A con B, esto sería A= A+B;, sería el primer método donde solo pide un complejo
       A.sumar(B);
       
       //se comprueba la suma con el método imprimir
       A.imprimir();
       
       //hacer uso del segundo método de sumar, donde pide a dos complejos
       C.sumar(A,B);
       
       C.imprimir();
       
       //lo mismo pero ahora con las sumas
       System.out.println("Restas:\n"); 
       A.restar(B);
       A.imprimir();
       
       C.restar(A,B);
       C.imprimir();
       
    }//fin del main()
}//fin de la clase de usoComplejo
