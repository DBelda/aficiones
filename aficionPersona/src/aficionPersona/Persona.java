package aficionPersona;


public class Persona {

    Aficion misAficiones;
    private boolean afin;
    
    
    public Persona (String[] Aficiones){
        this.misAficiones = new Aficion(Aficiones);
        this.afin = false;
    }

    
    public Aficion getAficionClase(){
        return this.misAficiones;
    }
    
   
    public String esAfin(){
        if (this.afin)
            return " las 2 personas son afines";
        else
            return " las 2 personas no son afines";
    }
    
    
    public void verAfinidad (Aficion Aficiones){
        if(this.afin && this.misAficiones.sonAfines(Aficiones)){
            this.afin = true;
            
        }
    }
    
    
    public static void main( String [] args ) { 
   
        
    }
}
    
