package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.Propiedades;

public class Componer {
	public String mostrar() {
		Archivo a = new Archivo();
		String z = "Mira" + a.leer();
		a.escrbir();
		return z;
	}
	public String gestionarPropiedades() {
	Propiedades prop = new Propiedades();
	prop.escribirPropiedades();
	return "Se Leyeron estas Propiedades" + " \n" + prop.leerPropiedades();
	}

}
