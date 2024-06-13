/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agregap;

/**
 *
 * @author yayit
 */
public class AgregaP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //una variable tipo CuentaA
        CuentaA ctaAux;
        CuentaA dosaux;
        //crear un cliente
        Cliente aux=new Cliente("Harry Potter", "55458");
        Cliente dos=new Cliente("Sancho Panza", "SPANZA");
        
        //al establecer la cuenta se pone el saldo inicial
        dos.establecerCuenta(new CuentaA(100.35));
        //crearle una cuenta a este cliente, se crea un objeto de tipo CuentaA dentro del argumento de establecer cuenta
        aux.establecerCuenta(new CuentaA(564.54));
        
        //obtener la cuenta de Harry, como regresa algo tipo Cuenta por eso se puso la variable de Cuenta para que se pudiera guardar
        ctaAux=aux.obtenerCuenta();
        //se deposita a la cuenta de Harry
        ctaAux.depositar(325.44);
        
        //hacer un retiro al segundo cliente
        dosaux=dos.obtenerCuenta();
        
        dosaux.retirar(100);
        
        System.out.println("Nombre del cliente: "+aux.obtenerNombre());
        System.out.println();
        System.out.println("Numero de cuenta: "+aux.obtenerNumCuenta());
        System.out.println();
        //así porque consultar está en la clase Cuenta
        System.out.println("Saldo: "+ctaAux.consultar());
        System.out.println();
        //ahora para Sancho Panza
         System.out.println("Nombre del cliente: "+dos.obtenerNombre());
        System.out.println();
        System.out.println("Numero de cuenta: "+dos.obtenerNumCuenta());
        System.out.println();
        //así porque consultar está en la clase Cuenta
        System.out.println("Saldo: "+dosaux.consultar());
    }
    
}
