package co.edu.udistrital.controller;

import java.util.ArrayList;
import java.util.Iterator;

import co.edu.udistrital.model.Persona;
import co.edu.udistrital.view.Vista;

public class Controlador {
	
	//Declaracion atributos
	private Persona per;
	private Vista view;
	
	private ArrayList<Persona> listaPersonas;
	
	public Controlador() {
		view = new Vista();
		listaPersonas = new ArrayList<Persona>();
	}
	
	public void agregarPersona() {
		
		view.mostrarInformacion("Escriba la cédula de la nueva persona que desea agregar:");
		String cedula = view.leerText();
		boolean existe=existePersona(cedula);
		
		if(existe == false) {
			String nombre = view.leerText();
			int edad = view.leerNum();
			
			per = new Persona(nombre, cedula,edad);
			listaPersonas.add(per);
			view.mostrarInformacion("La persona con cédula "+ cedula+" fue agregada.");
			
		}
		else {
			view.mostrarInformacion("La persona con la cédula "+cedula+" ya existe.");
		}
		
	}
	
	public String verPersonas() {
		String resp = "";
		
		for (int i = 0; i < listaPersonas.size(); i++) {
			resp += listaPersonas.get(i).toString()+"\n";
		}
		
		return resp;
	}
	
	public Persona buscarPersona(String cedula) {
		Persona persona = null;
		
		for (int i = 0; i < listaPersonas.size(); i++) {
			if(listaPersonas.get(i).getCedula().equals(cedula)) {
				persona = listaPersonas.get(i);
			}
		}
		
		return persona;
	}
	
	public boolean existePersona(String cedula) {
		boolean resp = false;
		
		for (int i = 0; i < listaPersonas.size(); i++) {
			if(listaPersonas.get(i).getCedula().equals(cedula)) {
				resp = true;
			}
		}
		
		return resp;
	}
	
	

}
