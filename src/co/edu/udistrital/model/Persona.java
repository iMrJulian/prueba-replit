package co.edu.udistrital.model;

public class Persona {
	
	//Declaración de atributos
	private String nombre;
	private String cedula;
	private int edad;
	
	//Inicialización de Atributos: Mediante el método constructor
	public Persona() {
		nombre = "";
		cedula = "";
		edad = 0;
	}
	
	public Persona(String nombre, String cedula, int edad) {
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
	}

		
	//Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Nombre=" + nombre + ", Cedula=" + cedula + ", Edad=" + edad;
	}
	
	
	
	

}
