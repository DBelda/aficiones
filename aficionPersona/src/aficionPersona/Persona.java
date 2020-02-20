package aficionPersona;


public class Persona {

    Aficion misAficiones;
    private boolean afin;
    
    
    public Persona (String[] aficionesArray){
        this.misAficiones = new Aficion(aficionesArray);
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
    
    
    public void verAfinidad (Aficion aficionesArray){
        if(this.afin && this.misAficiones.sonAfines(aficionesArray)){
            this.afin = true;
            
        }
    }
   
        
    }
    
