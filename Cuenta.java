/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancaria;

/**
 *
 * @author yayit
 */
public class Cuenta {
    //los atributos siempre van privados 
    private double saldo;
    
    //constructor
    public Cuenta(double saldoInicial){
        saldo=saldoInicial;
    }
    
    //método devuelve el saldo actual
    double consultar(){
        return saldo;
    }
    //método para depositar a la cuenta
    void depositar(double monto){
        saldo=saldo+monto;
    }
    
    //método para retirar de la cuenta, decrementa el saldo inicial
    //solo se podrá retirar si el saldo es igual o mayor al monto dado
    //para que la condición se cumpla, que el saldo quede en 0 o más
    void retirar(double monto){
        if(saldo >= monto){
            saldo = saldo - monto;
        }
        else{
            System.out.println("\nNo se puede retirar esa cantidad de la cuenta\n");
        }
    }
    
    
}
