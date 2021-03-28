package co.edu.unbosque.controller;

import co.edu.unbosque.model.Componer;
import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.view.Vista;

public class Controlador {
	private Vista v;
	private Componer c;

	public Controlador() {
		c = new Componer();
		v = new Vista();
		funcionar();
	}

	public void funcionar() {
		v.mostrarResultados(c.mostrar());
		c.guardar();
		v.mostrarResultados(c.gestionarPropiedades());

	}
}
