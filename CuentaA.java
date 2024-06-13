/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregap;

/**
 *
 * @author yayit
 */
public class CuentaA {
    private double saldo;
     
   public CuentaA(double saldo){
       this.saldo=saldo;
   }
   public double consultar(){
       return saldo;
   }
   public void depositar(double monto){
       saldo+=monto;
   }
   public void retirar(double monto){
       if(saldo >=monto){
           saldo-=monto;
       }
       else{
           System.out.println("Saldo insuficiente:/");
       }
       
   }
}
