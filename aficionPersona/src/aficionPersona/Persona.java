package aficionPersona;

/**
 * @author Alejandra & David 
 * @version 3.60
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Persona {
	private static int cont = 0; // Contador de Personas
	private int codPersona; // Código de Persona
	private String nombre; // Nombre de la Persona
	private Aficion[] misAficiones; // Aficiones de la Persona
	
	
	/* Constructor de Persona */
	public Persona(String nombre, Aficion[] misAficiones) {
		this.codPersona = ++cont;
		this.nombre = nombre;
		this.misAficiones = misAficiones;
	}
	
	/**@return CodPersona*/
	public int getCodPersona() {  //Getter de CodPersona
		return codPersona;
	}

	/**@return Nombre*/
	public String getNombre() {  //Getter de Nombre
		return nombre;
	}


	public Aficion[] misAficiones() { 
		return misAficiones;
	}


	public void setCodPersona(int codPersona) {  //Setter de CodPersona
		this.codPersona = codPersona;
	}


	public void setNombre(String nombre) {  //Setter de Nombre
		this.nombre = nombre;
	}


	public void setAficiones(Aficion[] misAficiones) { //Setter de Aficiones
		this.misAficiones = misAficiones;
	}
	
	//Crea 2 listas cada una con las aficiones correspondientes a cada persona
	public static boolean sonAfines(Persona p1, Persona p2) {
		List<Aficion> list1 = new ArrayList<Aficion>(Arrays.asList(p1.misAficiones()));
		List<Aficion> list2 = new ArrayList<Aficion>(Arrays.asList(p2.misAficiones()));
		list1.retainAll(list2); //Resta los atributos que no son iguales
		return list1.size() >= 3; //Retorna el tamaño de la lista 1 que sea >=3 
	}
	
	@Override
	public boolean equals(Object obj) {  // Compara si las personas son iguales y retorna el código
		Persona other = (Persona) obj;
		return this.codPersona == other.codPersona;
	}
	
	@Override
	/* Método toString */
	public String toString() {
		return String.format("%d: %s", this.codPersona, this.nombre);
	}

}
