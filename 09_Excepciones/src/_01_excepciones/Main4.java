package _01_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		boolean continuar = false;
		do{
			try{
				System.out.println("Introduzca dos numero a dividir");
				Scanner sc = new Scanner(System.in);
				System.out.println("Introduzca el numerador");
				int numerador = sc.nextInt();
				System.out.println("Introduzca el denominador");
				int denominador = sc.nextInt();
				int resultado = numerador/denominador;
				System.out.println("El resultado es: " + resultado);
				continuar = false;
				//desde java 1.7 podemos capturar tambien dos o mas excepciones
				//dentro de un mismo bloque
			}catch(ArithmeticException | InputMismatchException ime){
				System.out.println("No se puede dividir por cero o solo se admiten numeros");
				continuar = true;
			}catch(Exception e){
				System.out.println("Algun tipo de error ocurrido");
				continuar = true;
			}finally {
				//el boque finally se ejecuta SIEMPRE tanto si hemos
				//pasado por el try como por el catch
				//suelen ir cierre de conexiones, ficheros, etc
			}
		}while(continuar);

		
		System.out.println("Programa terminado");

	}

}
