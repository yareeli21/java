package Empleado;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yayit
 */
public class UsoEmpleado {
    public static void main(String[] args){
        //vamos a instanciar los objetos
        Empleado e1 = new Empleado("Eduardo Bacilio","20205465");
        Empleado e2 = new Empleado("Yareli Zavala", "20236307");
        
        //invocación al método de clase de la clase Empleado
        //se llama por un objeto de tipo de la clase, en este caso de tipo Empleado
        Empleado.reportarEmpleados();
        
        //se imprimen los empleados instanciados
        e1.imprime();
        e2.imprime();
    }
}
