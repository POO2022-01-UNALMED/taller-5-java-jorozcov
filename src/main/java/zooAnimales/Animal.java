package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;


public class Animal {
	private static int totalAnimales = 0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona;
	
	public Animal() {}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		totalAnimales++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public String totalPorTipo() {
		return "Mamiferos: "+Mamifero.cantidadMamiferos()+"\n"+
				"Aves "+Ave.cantidadAves()+"\n"+
				"Reptiles: "+Reptil.cantidadReptiles()+"\n"+
				"Peces: "+Pez.cantidadPeces()+"\n"+
				"Anfibios: "+Anfibio.cantidadAnfibios();
	}
	
	public String toString() {
		return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat;
	}
	
}
