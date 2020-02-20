package aficionPersona;

/**
 *
 * @author DavidB
 */
    public class Main {
      
       static String aficPersona1[] = {"Programar", "Cantar", "Bailar", "Escribir"};
       static String aficPersona2[] = {"Programar", "Cantar", "Bailar", "Escribir"};
 
         
         static Persona Antonio = new Persona(aficPersona1);
         static Persona Javier = new Persona(aficPersona2);
    

     public static void main( String [] args ) { 
     Antonio.verAfinidad(Javier.getAficionClase());
     System.out.println("Antonio y Javier" + Antonio.esAfin());
     
    
   
     
    
    }
  }