/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2d;

/**
 *
 * @author yayit
 */
public class Array2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz2D [][]= new int[4][];
        matriz2D[0] = new int[1];
        matriz2D[1]=new int[2];
        matriz2D[2]=new int[3];
        matriz2D[3]=new int[4];
        
        int i,j,k=0;
        for(i=0; i<4; i++){
            for(j=0; j<i+1; j++){
                matriz2D[i][j]=k;
                k++;
            }
        }
        for(i=0; i<4; i++){
            for(j=0; j<i+1; j++){
                System.out.println(matriz2D[i][j] + " ");
                System.out.println();
            }
        }
        
    }
    
}
