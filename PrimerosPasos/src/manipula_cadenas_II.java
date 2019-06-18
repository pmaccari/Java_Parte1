
public class manipula_cadenas_II {

	public static void main(String[] args) {
		// Como crear una cadena dentro de otra (String dentro de String)
											//Extrayendo " para programar en Java" (29, 57)
		String frase="Hoy es un estupendo día para aprender a programar en Java";
		
		String frase_resumen=frase.substring(0, 29) + "irnos a la playa y olvidarnos de todo...." + " y " +
		frase.substring(29,  57);
		
		System.out.println(frase_resumen);
		

	}

}
