/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregap;

/**
 *
 * @author yayit
 */
public class Cliente {
    //atributos con acceso privado
    private String nombre;
    private CuentaA cuenta;
    private String numCuenta;
    
    //constructor para inicializar atributos, no se inicializa el atributo que es de otra clase
    public Cliente(String nombre, String numCuenta){
        this.nombre=nombre;
        this.numCuenta=numCuenta;
    }
    
    //métodos
    //obtenerNombre: devuelve el nombre
    public String obtenerNombre(){
        return nombre;
    }
    public CuentaA obtenerCuenta(){
        return cuenta;
    }
    //establecerCuenta: establece el objeto dentro de la clase Cuenta
    public void establecerCuenta(CuentaA cta){
        cuenta=cta;
    }
    public String obtenerNumCuenta(){
        return numCuenta;
    }
}
