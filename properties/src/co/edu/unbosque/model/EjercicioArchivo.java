package co.edu.unbosque.model;
import co.edu.unbosque.model.persistence.*;
public class EjercicioArchivo {
	public String gestionarPropiedades() {
	Propiedades prop = new Propiedades();
	prop.escribirPropiedades();
	return "Se Leyeron estas Propiedades" + " \n" + prop.leerPropiedades();
	}

}
