package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Ave extends Animal {
	private ArrayList<Ave> listado;
	public static int halcones = 0;
	public static int aguilas = 0;
	private String colorPlumas;
	
	public Ave() {}
	public Ave( String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super( nombre,  edad,  habitat,  genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	
	public static int cantidadAves() {
		return halcones + aguilas;
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public void crearHalcon(String nombre, int edad, String genero) {
		this.halcones++;
		new Ave(nombre,  edad,  "montanas",  genero, "cafe glorioso");
	}
	
	public void crearAguila( String nombre, int edad, String genero) {
		this.aguilas++;
		new Ave(nombre,  edad,  "montanas",  genero,"blanco y amarillo");
		
	}

}
