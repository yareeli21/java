/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author yayit
 */
public  class Mamifero extends Animal{
        
        public Mamifero(String especie, String nombre, float peso, int numJ) {
            super(especie, nombre, peso, numJ);
        }
        
    /**
     *
     * @return
     */
    @Override
        public String queAnimalEres(){
        return "Mamifero";
    }

        
    }


