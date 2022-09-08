package thalia;
import java.lang.*;
import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
	System.out.println("Introduzca un numero entero ");	
		int numer=entrada.nextInt();
		 
		if (numer% 2==0)
		 {
			 System.out.println( "Es par");}
		 
		 else {
			 System.out.println("Es impar");
		 }
		 
		
		
		
	
	}

}
/* Programa Java que lea un número entero por teclado y calcule si es par o impar. Podemos saber si un número es par, si el resto de dividir el número entre 2 es igual a cero. En caso contrario el número es impar.
El operador Java que calcula el resto de la división entre dos números enteros, es el operador %.
Ejemplo: 5%2 = 1 -> Impar 4%2 = 0 -> Par*/