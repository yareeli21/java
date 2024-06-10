/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentabancaria;

/**
 *
 * @author yayit
 */
public class CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //se crea un objeto con un saldo inicial 
        Cuenta c1 = new Cuenta(100.0);
        //otro objeto con distinto saldo inicial
        Cuenta c2 = new Cuenta(235.60);
        
        //desplegar saldo actual de ambar cuentas
        System.out.println("Saldo inicial de la cuenta 1: "+c1.consultar());
        System.out.println("Saldo inicial de la cuenta 2: "+c2.consultar());
        
        //ahora se le depositará con el método creado anteriormente
        c1.depositar(235.10);
        c2.depositar(84.21);
        
        //saldo después del depósito
        
        System.out.println("\nSaldo despues del deposito a la cuenta 1: "+c1.consultar());
        System.out.println("\nSaldo despues del deposito a la cuenta 2: "+c2.consultar());
        
        //ahora se hará un retiro con el método creado anteriormente
        c1.retirar(250.1);
        c2.retirar(600.0);
        
        //saldo después del retiro
        System.out.println("\nSaldo despues del retiro a la cuenta 1: "+c1.consultar());
        System.out.println("\nSaldo despues del retiro a la cuenta 2: "+c2.consultar());
     
    }
    
}
