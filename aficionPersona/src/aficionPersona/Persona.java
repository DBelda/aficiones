package aficionPersona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Persona {
	private static int cont = 0;
	private int codPersona;
	private String nombre;
	private Aficion[] misAficiones;
	
	
	public Persona(String nombre, Aficion[] misAficiones) {
		this.codPersona = ++cont;
		this.nombre = nombre;
		this.misAficiones = misAficiones;
	}
	
	public int getCodPersona() {
		return codPersona;
	}


	public String getNombre() {
		return nombre;
	}


	public Aficion[] misAficiones() {
		return misAficiones;
	}


	public void setCodPersona(int codPersona) {
		this.codPersona = codPersona;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setAficiones(Aficion[] misAficiones) {
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
	public boolean equals(Object obj) { 
		Persona other = (Persona) obj;
		return this.codPersona == other.codPersona;
	}
	
	@Override
	public String toString() {
		return String.format("%d: %s", this.codPersona, this.nombre);
	}

}
