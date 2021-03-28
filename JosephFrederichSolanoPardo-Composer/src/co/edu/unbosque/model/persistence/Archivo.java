package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;

public class Archivo {
	 Letra l = new Letra();
	private  String arc = l.generarLetra();
	

	public String escrbir() {
		JFileChooser j = new JFileChooser();
		j.showSaveDialog(j);
		File f = j.getSelectedFile();
		
		try {
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(arc);
			fw.close();
		} catch (IOException e) {
			return null;
		}
		return "se pudo";
	}
	
	public String leer() {
		String linea = "";
		
		String cadena = "";
		File f = new File( "/data/cancion.txt");
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			while (linea != null) {
				cadena += linea + "\n" ;
				linea = br.readLine();

			}
			linea = br.readLine();
			fr.close();
		} catch (IOException e) {
			return null;
		}
		return cadena;

	}

}
