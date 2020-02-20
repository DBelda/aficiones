package aficionPersona;

/**
 *
 *
 */
public class Aficion {
    
   // Variables 
   private String [] Aficiones = new String [10];
   private int length;
   
   // Constructor
   public Aficion(String []aficionesArray){
       this.Aficiones = aficionesArray;
       this.length = this.Aficiones.length;
   }
   
   
    //Obtener Aficiones
   public String[] getAficiones(){
       return this.Aficiones;
       
   }
   
   //Obtener longitud
   public int getLength(){
       return this.length;
   }
    
   
   //Ver si son afines 
   public boolean  sonAfines (Aficion aficionesArray){
       int aficionesAfines = 0;
       for (int i = 0; i < this.length; i++){
           for(int j = 0; j < aficionesArray.getLength(); j++) {
               if (this.Aficiones[i]== aficionesArray.getAficiones()[j])
                   aficionesAfines++;
           }
       }
       
       if (aficionesAfines >=3)
           return true;
       
       return false;
           
           
           
           
       }
   }
