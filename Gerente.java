/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usoherencia;

/**
 *
 * @author yayit
 */
public class Gerente extends Empleado{
   
    private String area;
    
    public Gerente(String nombre, double salario, String numEmpleado, String area){
        super(nombre,salario,numEmpleado);
        this.area=area;
    }
    //aquí se manda a llamar el toString de la clase base y se agrega el atributo de la subclase

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return super.toString()+"Gerente del area de: "+area;
    }
    //métodp de la subclase 
    public void contratarPersonal(){
        
        System.out.println("Las contrataciones en el area de: "+area+ "fueron 2");
    
    }
    //este método muetsra el acceso de la clase Gerente a los atributos protegidos de su clase base
    public void cambiarSalario(double nuevo){
        salario=nuevo;
    }
 
}
