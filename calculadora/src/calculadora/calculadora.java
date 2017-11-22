package calculadora;
import java.util.*;
public class calculadora {

	public static void main(String[] args) {

		double num1=0,num2=0,resultado=0;
		int op=0;
		Scanner teclado= new Scanner(System.in);
		System.out.printf("\t Elije una opcion: ");
			System.out.println("1) Sumar");
			System.out.println("2) Restar");
			System.out.println("3) Multiplicacion");
			System.out.println("4) Division");
			op=teclado.nextInt();
			
			switch(op){
			case 1:
				break;
			case 2:
				System.out.println("dime los numeros que quieres restar");
				num1=teclado.nextInt();
				num2=teclado.nextInt();
				resultado=num1-num2;
				System.out.println(num1+" - "+num2+" = "+resultado);
				break;
			case 3:
				break;
			case 4:
          System.out.println("Dame un numero por teclado");
		      num1= teclado.nextInt();
		      System.out.println("Dame otro numero por teclado");
		      num2= teclado.nextInt();
          System.out.println("Resultado: " + resultado);
				break;
			}//switch
	}//main
}//class
