package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado;
	public static int iguanas = 0;
	public static int serpientes = 0;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {}
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre,  edad,  habitat,  genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	public static int cantidadReptiles() {
		return iguanas + serpientes;
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public void crearIguana(String nombre, int edad, String genero) {
		this.iguanas++;
		new Reptil( nombre,  edad,  "humedal",  genero,  "verde",  3);
	}
	public void crearSerpiente( String nombre, int edad, String genero) {
		this.serpientes++;
		new Reptil( nombre,  edad,  "jungla",  genero, "blanco",  1);
		}

}
