package aficionPersona;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	final static Aficion basket = new Aficion("basket");
	final static Aficion futbol = new Aficion("futbol");
	final static Aficion bricolaje = new Aficion("bricolaje");
	final static Aficion pintar = new Aficion("pintar");
	final static Aficion leer = new Aficion("leer");
	final static Aficion cantar = new Aficion("cantar");
	final static Aficion escribir = new Aficion("escribir");
	final static Aficion programar = new Aficion("programar");
	final static Aficion natacion = new Aficion("natacion");
	final static Aficion bolos = new Aficion("bolos");
	final static Aficion golf = new Aficion("golf");
	
	

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		final Persona[] personas = {
			new	Persona("Pepe", new Aficion[]{futbol, cantar, leer, bolos, golf}),
			new	Persona("David", new Aficion[]{programar, cantar, natacion, bricolaje, basket}),
			new	Persona("Alejandra", new Aficion[]{futbol, cantar, programar, bolos, pintar}),
			new	Persona("Roberto", new Aficion[]{programar,bolos,basket,pintar,leer}),
			new	Persona("María", new Aficion[]{leer,pintar,bricolaje,futbol,natacion})
		};
		
		final List<Persona> lista = Arrays.asList(personas); //Crea una lista de personas llamada Persona
		
		System.out.println("Selecciona por número la persona con la que quieres ver las afinidades.");
		System.out.println("Las personas elegibles son :" );
		lista.forEach(System.out::println); //Imprime la lista de Personas
		System.out.print("Código : ");
		
		int cod = Integer.parseInt(sc.nextLine());
		Persona selectedP = lista.stream().filter(p -> p.getCodPersona() == cod).findFirst().orElse(null);
		if (selectedP == null) {
			System.out.println("No existe la persona");
			return;
		}
		
		lista.forEach(p -> {
			if (p.equals(selectedP))
				return;
			boolean sonAfines = Persona.sonAfines(p, selectedP);
			System.out.printf("%s y %s %s afines\n", p.getNombre(), selectedP.getNombre(), sonAfines ? "son" : "no son"); 
			// %s significa cadena de carácteres
		});
	}
}

