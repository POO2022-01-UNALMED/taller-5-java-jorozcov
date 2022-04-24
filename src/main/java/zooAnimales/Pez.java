package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> listado;
	public static int salmones = 0;
	public static int bacalaos = 0;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {}
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre,  edad,  habitat,  genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	
	public static int cantidadPeces() {
		return salmones + bacalaos;
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez.salmones++;
		return (new Pez(nombre,  edad,  "oceano",  genero,"rojo",  6));
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez.bacalaos++;
		return (new Pez(nombre,  edad,  "oceano",  genero,"gris",  6));
		}
	

}
