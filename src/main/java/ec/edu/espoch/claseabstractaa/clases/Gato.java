/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.claseabstractaa.clases;

/**
 *
 * @author USER
 */
public class Gato extends Felino {
    
        @Override
        public   String getNombreCientifico(){
        return "Felis silvestris catus";
    }
    
            @Override
    public   String getSonido(){
        return "Maullido";
    }

        @Override
    public   String getHabitad(){
        return"Domestico";
    }
    
        @Override
    public  String getAlimento(){
        return "Ratones";
    }
             
}
