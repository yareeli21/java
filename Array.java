/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

/**
 *
 * @author yayit
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //se hará un arreglo de los días de un mes
        //Se inicializa en que será de 12 posiciones el arreglo
        int month_days[] = new int[12];
        month_days[0]=31;
        month_days[1]=28;
        month_days[2]=31;
        month_days[3]=30;
        month_days[4]=31;
        month_days[5]=20;
        month_days[6]=31;
        month_days[7]=31;
        month_days[8]=30;
        month_days[9]=31;
        month_days[10]=30;
        month_days[11]=31;
        
        System.out.println(" April has "+month_days[3]+ " days.");
    }
    
}
