package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private ArrayList<Zoologico> zoo = new ArrayList<Zoologico>();
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public Zona() {}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo.add(zoo);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nomb) {
		this.nombre = nomb;
	}
	
	public Zoologico getZoo() {
		return zoo.get(0);
	}
	
	public void setZoo(ArrayList<Zoologico> zoo) {
		this.zoo = zoo;
	}
	
	public ArrayList<Animal> getAnimales(){
		return this.animales;
	}
	
	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
	public void agregarAnimales(Animal nuevo) {
		animales.add(nuevo);
	}
	public int cantidadAnimales() {
		int total = animales.size();
		return total;
	}
}
