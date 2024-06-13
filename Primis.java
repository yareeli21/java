/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobreescritura;

/**
 *
 * @author yayit
 */
public class Primis {
    //son accesibles dentro de todo el paquete, no tienen el private
    int i,j;
   
    Primis(int a, int b){
        i=a;
        j=b;
    }
    void mostrar(){
        System.out.println("i y j: "+i+" "+j);
    }
    
}

class Seguns extends Primis{
    int k;
    
    Seguns(int a, int b, int c){
        //aquí dice que a y b son los atributos que hereda de Primis
        super(a,b);
        k=c;
    }
    //aquí hay un sobremétodo, o sea que es el mismo método pero para una clase hija y por eso se le pone el override
    @Override
    void mostrar(){
        System.out.println("k: "+k);
    }
}
