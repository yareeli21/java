/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author yayit
 */
public class Ave extends Animal{

    public String getColor() {
        return color;
    }

    public float getAltura() {
        return altura;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
        
        private String color;
        private float altura;
        
        public Ave(String especie, String nombre, float peso, int numJ, String color, float altura) {
            super(especie, nombre, peso, numJ);
            
            this.color=color;
            this.altura=altura;
        }
        
    /**
     *
     * @return
     */
    @Override
        public String queAnimalEres(){
        return "ave";
    }

    }
    

