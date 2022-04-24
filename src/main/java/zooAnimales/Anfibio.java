package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Anfibio extends Animal{
	private ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {}
	public Anfibio(String nombre, int edad, String habitat, String genero,String colorPiel, boolean venenoso) {
		super(nombre,  edad,  habitat,  genero);
		listado.add(this);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	
	public boolean getVenenoso() {
		return venenoso;
	}
	
	public static int cantidadAnfibios() {
		return salamandras + ranas;
	}
	public String movimiento() {
		return "saltar";
	}
	public void crearRana(String nombre, int edad, String genero) {
		ranas++;
		new Anfibio(nombre,  edad,  "selva",  genero, "rojo",  true);
	}
	public void crearSalamandra( String nombre, int edad, String genero) {
		ranas++;
		new Anfibio(nombre,  edad,  "selva",  genero,"negro y amarillo",  false);}
	
}
