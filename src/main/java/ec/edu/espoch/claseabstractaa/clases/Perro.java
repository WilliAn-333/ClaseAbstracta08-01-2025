
package ec.edu.espoch.claseabstractaa.clases;

public class Perro extends Canino {
    
    
   @Override
    public   String getNombreCientifico(){
        return "Canislupus familiaris";
    }
    @Override
    public   String getSonido(){
        return "Ladrido";
    }

    @Override
    public   String getHabitad(){
        return"Domestico";
    }
    @Override
    public  String getAlimento(){
        return "Carnivoro";
    }
                
    
}
