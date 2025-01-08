/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.claseabstractaa.clases;

/**
 *
 * @author USER
 */
public class Lobo extends Canino {
    
    @Override
        public   String getNombreCientifico(){
        return "Canislupus ";
    }
        
    @Override
    public   String getSonido(){
        return "Aullido";
    }
    @Override
    public   String getHabitad(){
        return"Bosque";
    }
    
    @Override
    public  String getAlimento(){
        return "Carnivoro";
    }
             
    
}
