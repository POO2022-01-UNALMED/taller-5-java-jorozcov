package zooAnimales;

import java.util.ArrayList;


public class Mamifero extends Animal {
	private ArrayList<Mamifero> listado;
	public static int caballos = 0;
	public static int leones = 0;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {}
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		
		super(nombre,  edad,  habitat,  genero);
		listado.add(this);
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	public ArrayList<Mamifero> getListado(){
		return listado;
	}
	
	public boolean getPelaje() {
		return pelaje;
	}
	
	public int getPatas() {
		return patas;
	}
	
	public static int cantidadMamiferos() {
		int total = caballos + leones;
		return total;
	}
	
	public void creaCaballo(String nombre, int edad, String genero) {
		this.caballos++;
		new Mamifero(nombre, edad,"pradera", genero, true, 4);
	}
	
	public void crearLeon( String nombre, int edad, String genero) {
		this.leones++;
		new Mamifero( nombre, edad,"selva", genero, true, 4);
	}

}
