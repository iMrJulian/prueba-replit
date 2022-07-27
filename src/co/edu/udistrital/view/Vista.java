package co.edu.udistrital.view;

import java.util.Scanner;

public class Vista {
	
	private Scanner leer;
	
	public Vista() {
		leer = new Scanner(System.in);
	}
	
	public void mostrarInformacion(String mensaje) {
		System.out.println(mensaje);
	}	
	
	public int leerNum() {
		return leer.nextInt();
	}
	
	public String leerText() {
		return leer.nextLine();
	}	

}
