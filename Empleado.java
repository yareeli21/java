package Empleado;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yayit
 */
public class Empleado {
    //variables de instancia
    private String nombre;
    private String RFC;
    
    //variable de clase
    //Se hace uso del "static", como es un contador será inicializado en 0
    public static int contador=0;
    
    //constructor de la clase Empleado
    public Empleado(String nom, String rfc){
        nombre=nom;
        RFC=rfc;
        contador++;//se dice que irá aumentando cada vez que se instancie un objeto
    }
    
    //método de clase
    
    public static void reportarEmpleados(){
        System.out.println("El numero de empleado es: "+contador);
    }
    //método de la clase de instancia
    public void imprime(){
        System.out.println("Nombre: "+nombre + " RFC: "+RFC);
        
    }
}
