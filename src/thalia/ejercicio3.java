package thalia;
import java.util.*;
public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner entrada= new Scanner(System.in);
   int valorc= entrada.nextInt();
    
   int fahrenheit = 32+(9*valorc/5);
  
   
 
   
   System.out.println("los grados fahrenheit son "  + fahrenheit);
   
   
	}

}
/*Programa que lea una cantidad de grados centigrados y la pase a grados Fahrenheit.La formula 
 * correspondientepara pasar de grados centigrados a fahrenheit es:
 * Fahrenheit=32+(9*C/5)
 * C es el valor de los grados centigrados introducidos por el usuario.*/
