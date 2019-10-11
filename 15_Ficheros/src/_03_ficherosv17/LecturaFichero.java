
package _03_ficherosv17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFichero {

	public static void main(String[] args) {
		System.out.println("Vamos a leer nuestro fichero de texto + " + EscrituraFichero.NOMBRE_FICHERO);

		try (FileReader fr = new FileReader(EscrituraFichero.NOMBRE_FICHERO);
			 BufferedReader br = new BufferedReader(fr);) {
			String s = br.readLine();
			while(s != null){
				System.out.println("Frase del fichero: " +s);
				s = br.readLine();
			}
			System.out.println("Fichero leido correctamente");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}