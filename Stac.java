/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stac;

/**
 *
 * @author yayit
 */
public class Stac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Static ob1=new Static();
          Static ob2=new Static();
          ob1.c=5;//al atributo del objeto
          ob1.a=7;//a la variable de clase
          
          System.out.println("ob1.c = " +ob1.c);
          System.out.println("ob1.a = " +ob1.a);
          
           ob2.c=15;
          ob2.a=10;  
          
          System.out.println("ob2.c = " +ob2.c);
           System.out.println("ob2.a = " +ob2.a);
            System.out.println("ob1.a = " +ob1.a);
             System.out.println("a = " +Static.a);
             System.out.println("ob1.c = " +ob1.c);
    }
    
}
