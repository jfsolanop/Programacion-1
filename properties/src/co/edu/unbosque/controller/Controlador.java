package co.edu.unbosque.controller;

import co.edu.unbosque.model.EjercicioArchivo;
import co.edu.unbosque.view.Vista;

public class Controlador {
	private Vista gui;
	private EjercicioArchivo m;

	public Controlador() {
		m = new EjercicioArchivo();
		gui = new Vista();
		funcionar();
	}

	private void funcionar() {
		gui.mostrarResultados(m.gestionarPropiedades());

	}
}
