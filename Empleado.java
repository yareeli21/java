/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usoherencia;

/**
 *
 * @author yayit
 */
public class Empleado {
    protected String nombre;
    protected double salario;
    private String numEmpleado;
    
    public Empleado(String nombre, double salario, String numEmpleado){
        this.nombre=nombre;
        this.salario=salario;
        this.numEmpleado=numEmpleado;
    }
    
    //el método toString es un método de la clase Object de Java, la clase Empleado está redefiniendo este método
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+"\nSalario: \n"+salario+"\nNumero de empleado:\n"+numEmpleado;
    }
   
}

