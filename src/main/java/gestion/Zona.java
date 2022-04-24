package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private ArrayList<Zoologico> zoo;
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public Zona() {}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo.add(zoo);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Zoologico getZoo() {
		return zoo.get(0);
	}
	public void agregarAnimales(Animal nuevo) {
		animales.add(nuevo);
	}
	public int cantidadAnimales() {
		int total = animales.size();
		return total;
	}
}
