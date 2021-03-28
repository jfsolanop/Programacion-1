package co.edu.unbosque.model.persistence;

public class Letra {

	Propiedades p = new Propiedades();
	private String columna1[];
	private String columna2[];
	private String columna3[];
	private String columna4[];
	private String columna5[];
	private String columna6[];

	public Letra() {
		columna1 = new String[4];
		columna2 = new String[4];
		columna3 = new String[4];
		columna4 = new String[4];
		columna5 = new String[4];
		columna6 = new String[4];

		columna1[0] = "mami";
		columna1[1] = "bebe";
		columna1[2] = "princess";
		columna1[3] = "mami";

		columna2[0] = "Yo quiero";
		columna2[1] = "Yo puedo";
		columna2[2] = "Yo vengo";
		columna2[3] = "Yo a";

		columna3[0] = "Encenderte";
		columna3[1] = "Amarte";
		columna3[2] = "Ligar";
		columna3[3] = "Jugar";

		columna4[0] = "Suave";
		columna4[1] = "Lento";
		columna4[2] = "Rapido";
		columna4[3] = "Fuerte";

		columna5[0] = "Hasta que salga el sol";
		columna5[1] = "Toda la noche";
		columna5[2] = "Hasta el amanacer";
		columna5[3] = "Todo e dia";

		columna6[0] = "Sin anestecia";
		columna6[1] = "Sin compromiso";
		columna6[2] = "Face to Face";
		columna6[3] = "Sin Miedo";
	}


	public String generarLetra() {
		String a = "";
		int i;
		int o;
		for (i = 0; i <4; i++) {
			for (o = 0; o <= 3; o++) {
				String b = columna1[(int) (Math.random() * 3 + 1)] + "  " + columna2[(int) (Math.random() * 3 + 1)]
						+ "  " + columna3[(int) (Math.random() * 3 + 1)] + "  "
						+ columna4[(int) (Math.random() * 3 + 1)] + "  " + columna5[(int) (Math.random() * 3 + 1)]
						+ "  " + columna6[(int) (Math.random() * 3 + 1)];
				a = a + b;
				a += "\n";
			}
			a += "\n";
		}
		return a;
	}
}
