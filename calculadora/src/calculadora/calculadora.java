package calculadora;
import java.util.*;
public class calculadora {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int num1, num2, n;
		double resultado = 0;
		
		System.out.println("Dame un numero por teclado");
		num1= teclado.nextInt();
		System.out.println("Dame un numero por teclado");
		num2= teclado.nextInt();
		
		System.out.println("Elige una opcion cari: ");
		System.out.println("4. Multiplicacion");
		n = teclado.nextInt();
		switch(n)
		{
		case 4: resultado = num1 * num2;
		}
		
		System.out.println("Resultado: " + resultado);
	}//main

}//class
