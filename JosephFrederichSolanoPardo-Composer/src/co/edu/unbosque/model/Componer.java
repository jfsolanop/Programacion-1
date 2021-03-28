package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.Propiedades;

public class Componer {
	Archivo a = new Archivo();
	public String mostrar() {
		return  "Letra:  " +"\n" +  a.leer(); 
	}
	public String guardar() {
		 return a.escrbir();
	}
	public String gestionarPropiedades() {
	Propiedades prop = new Propiedades();
	prop.escribirPropiedades();
	return "Se Leyeron estas Propiedades" + " \n" + prop.leerPropiedades();
	}

}
