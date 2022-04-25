package gestion;

import java.util.ArrayList;


public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico() {}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;

	}
	
	public ArrayList<Zona> getZona(){
		return zonas;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public void agregarZonas(Zona nueva) {
		zonas.add(nueva);
	}
	
	public int cantidadTotalAnimales() {
		int total = 0;
		for (Zona Z:zonas) {
			total = total + Z.cantidadAnimales();
		}
		return total;
	}	
	
}
