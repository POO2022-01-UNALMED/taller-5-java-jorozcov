package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;


public class Animal {
	private static int totalAnimales = 0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona = new ArrayList<Zona>();
	
	public Animal() {}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		totalAnimales++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Zona> getZona() {
		return zona;
	}
	
	public void setZona(ArrayList<Zona> zona) {
		this.zona = zona;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getTotalAnimales() {
		return totalAnimales;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public void setHabitat(String habitad) {
		this.habitat = habitad;
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public static String totalPorTipo() {
		return "Mamiferos: "+Mamifero.cantidadMamiferos()+"\n"+
				"Aves: "+Ave.cantidadAves()+"\n"+
				"Reptiles: "+Reptil.cantidadReptiles()+"\n"+
				"Peces: "+Pez.cantidadPeces()+"\n"+
				"Anfibios: "+Anfibio.cantidadAnfibios();
	}
	
	public String toString() {
		return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat + " y mi genero es "+genero;
	}
	
}
