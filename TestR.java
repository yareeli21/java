/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testr;

/**
 *
 * @author yayit
 */
public class TestR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         TestRC ob=new TestRC(10,20);
        
        System.out.println("a y b antes: "+ob.a +" "+ob.b);
        
        ob.metodo(ob);
        
        System.out.println("a y b despues: "+ob.a+" "+ob.b);
    }
    
}
