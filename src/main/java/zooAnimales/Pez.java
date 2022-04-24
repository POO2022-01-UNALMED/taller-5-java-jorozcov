package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

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
	
	public void crearSalmon(String nombre, int edad, String genero) {
		this.salmones++;
		new Pez(nombre,  edad,  "oceano",  genero,"rojo",  6);
	}
	
	public void crearBacalao(String nombre, int edad, String genero) {
		this.bacalaos++;
		new Pez(nombre,  edad,  "oceano",  genero,"gris",  6);
		}
	

}
