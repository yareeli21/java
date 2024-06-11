/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraymm;

/**
 *
 * @author yayit
 */
public class ArrayMM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mayor,menor,suma;
        int [] nums={5,4,2,1}
;        suma=0;
      //se supone que el mayor y el menor son el número de la posición 0
        mayor=nums[0];
        menor=nums[0];
        //ciclo para determinar cuál es el mayor y cuál el menor
        for(int i=0; i<nums.length; i++){
            if(nums[i]>mayor){
                mayor=nums[i];
            }
            if(nums[i]<menor){
                menor=nums[i];
            }
            suma+=nums[i];
            
            System.out.println("El mayor es: "+mayor);
            System.out.println("\nEl menor es: "+menor);
            System.out.println("\nLa suma es: "+suma);
        }
        
    }
    
}
