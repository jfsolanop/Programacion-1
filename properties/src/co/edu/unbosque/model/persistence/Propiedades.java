package co.edu.unbosque.model.persistence;
import java.io.*;
import java.util.Properties;

public class Propiedades {

	private Properties prop = new Properties();
	private String archivoProp= "C:\\Data\\archivoProp.properties";
	public int escribirPropiedades () {
		try {
			prop.setProperty("nombreProyecto", "Archivos Texto");
			prop.setProperty("nombreArchivo", "archivoProp.properties");
			prop.setProperty("nombreCodigoFuente", "Properties.Java");
			prop.store(new FileOutputStream(archivoProp), null);
		}
		catch (IOException ex) {
			return -1;
		}
		return 0;
	}
	public String leerPropiedades () {
		String linea = "";
		try {
			prop.load(new FileInputStream(archivoProp));
			prop.list(System.out);
			linea += "Nombre del Proyecto : "+ prop.getProperty("nombreProyecto")+ "\n"; 
			linea +="Nombre del Archivo: "  + prop.getProperty("nombreArchivo")+ "\n"; 
			linea += "Nombre Proyecto : " + prop.getProperty("nombreCodigoFuente")+ "\n"; 
			
		}
		catch (IOException ex) {
			return null;
		}
		return linea;
		
	}
	

}
