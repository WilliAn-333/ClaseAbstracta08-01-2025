/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.claseabstractaa;

import ec.edu.espoch.claseabstractaa.clases.Animal;
import ec.edu.espoch.claseabstractaa.clases.Gato;
import ec.edu.espoch.claseabstractaa.clases.Leon;
import ec.edu.espoch.claseabstractaa.clases.Lobo;
import ec.edu.espoch.claseabstractaa.clases.Perro;

/**
 *
 * @author USER
 */
public class ClaseAbstractaa {

    public static void main(String[] args) {
   Animal[] animales = new Animal[4];
   
   animales[0] = new Gato();
   animales[1] = new Perro();
   animales[2] = new Lobo();
   animales[3] = new Leon();
   
   for (int i=0; i< animales.length; i++){
       System.out.println("Nombre Cientifico: "+animales[i].getNombreCientifico());
       System.out.println("Su sonido: "+animales[i].getSonido());
       System.out.println("Su habitad: "+animales[i].getHabitad());
       System.out.println("Su Alimento: "+animales[i].getAlimento());
   }
   
    }
}
