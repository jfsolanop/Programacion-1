package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
	private int estrofasA ;
	private int frasesA ;
	 Properties prop = new Properties();
	 File f = new File("/data/archivoProp.properties");
	public int escribirPropiedades() {
		try {
			prop.setProperty("nombreDelProyecto", "JosephFrederichSolanoPardo-Composer");
			prop.setProperty("codigoFuente", "Propiedades.java");
			prop.setProperty("nombreArchivo", "archivoProp.properties");
			prop.setProperty("estrofas", "3");
			prop.setProperty("frases", "4");
			prop.store(new FileOutputStream(f), null);
		} catch (IOException ex) {
			return -1;
		}
		return 0;
	}

	public String leerPropiedades() {
		String linea = "";
		try {
		
			prop.load(new FileInputStream(f));
			prop.list(System.out);
			
			linea += "Proyecto" + prop.getProperty("nombreDelProyecto") + "\n";
			linea += "Codigo " + prop.getProperty("codigoFuente") + "\n";
			linea += "Archivo " + prop.getProperty("nombreArchivo") + "\n";
			linea += "Estrofas " + prop.getProperty("estrofas") + "\n";
			linea += "Frases" + prop.getProperty("frases") + "\n";
			estrofasA =  Integer.parseInt(prop.getProperty("estrofas"));
			frasesA  = Integer.parseInt( prop.getProperty("frases"));
		} catch (IOException ex) {
			return null;
		}
		return linea;
	}
	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}



	public int getEstrofasA() {
		
		return estrofasA;
	}

	public void setEstrofasA(int estrofasA) {
		this.estrofasA = estrofasA;
	}

	public int getFrasesA() {
	
		return frasesA;
	}

	public void setFrasesA(int frasesA) {
		this.frasesA = frasesA;
	}





	}

