package thalia;

import java.math.*;
import java.util.*;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Entra el lado A");
		int a = entrada.nextInt();

		System.out.println("Entra al lado B ");
		int b = entrada.nextInt();

		System.out.println("Entra al  lado C");
		int c = entrada.nextInt();

		int p = (a + b + c / 2);
		
       double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
       
       System.out.println("El area del triangulo es " + area);
	}
}