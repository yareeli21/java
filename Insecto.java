/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author yayit
 */
public class Insecto extends Animal{

    public boolean getVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
        
        private boolean vuela;
        
        public Insecto(String especie, String nombre, float peso, int numJ, boolean vuela) {
            super(especie, nombre, peso, numJ);
            
            this.vuela=vuela;
        }
        
    /**
     *
     * @return
     */
    @Override
        public String queAnimalEres(){
        return "insecto";
    }

    }
