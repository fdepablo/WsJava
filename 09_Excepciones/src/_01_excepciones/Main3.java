package _01_excepciones;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Main3 main3 = new Main3();
		boolean continuar = false;
		do{
			try {
				int numero = main3.pedirValor("Numerador");
				System.out.println("numero :" + numero);
				continuar = false;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				continuar = true;
			}
		}while(continuar);
		

		main3.pedirValor2();
		System.out.println("Fin de programa");
	}
	
	//si la excepcion arrojada es de tipo exception, entonces
	//tenemos que capturarla
	public int pedirValor(String tipo) throws Exception{
		
		int numero = 0;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca el " + tipo);
			numero = sc.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		
		return numero;
	}
	
	//en caso de que arrojemos RuntimeException
	//no necesitamos capturarla
	public int pedirValor2() throws RuntimeException{
		throw new RuntimeException();
	}
	
}
