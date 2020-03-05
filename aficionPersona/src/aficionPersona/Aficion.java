package aficionPersona;

/**
 * @author Alejandra & David 
 * @version 3.50
 */



public class Aficion {
	
	/* Variables */
	private static int cont = 0; //Contador de aficiones
	private int codAficion; //Código de cada aficion
	private String nombre; //Nombre de cada aficion
	

	/* Constructor de Aficion */
	public Aficion(String nombre) {	
		this.codAficion = ++cont; 
		this.nombre = nombre;
	}

	
	public int getCodAficion() { //Getter de CodAficion
		return codAficion;
	}
	
	public String getNombre() { //Getter de Nombre
		return nombre;
	}
	
	public void setCodAficion(int codAficion) { //Setter de CodAficion
		this.codAficion = codAficion;
	}
	
	
	public void setNombre(String nombre) { //Setter de Nombre
		this.nombre = nombre;
	}
	

	/* Método boolean equals
	 *Si las 2 aficiones son iguales hace 
	 *que los 2 códigos se Aficion lo sean 
	 */
	public boolean equals(Object obj) {		
		Aficion other = (Aficion) obj;		
		return this.codAficion == other.codAficion; 
	}
	
}