package calculadora;
import java.util.*;
public class calculadora {

	public static void main(String[] args) {
		double num1=0,num2=0,resultado=0;
		int op=0;
		Scanner teclado= new Scanner(System.in);
		System.out.println("elije una opcion");
			System.out.println("1-sumar");
			System.out.println("2-restar");
			System.out.println("3-multiplicacion");
			System.out.println("4-division");
			op=teclado.nextInt();
			
			switch(op){
			case 1:
				break;
			case 2:
				System.out.println("dime los numeros que quieres restar");
				num1=teclado.nextInt();
				num2=teclado.nextInt();
				resultado=num1-num2;
				System.out.println(num1+"-"+num2+"="+resultado);
				break;
			case 3:
				break;
			case 4:
				break;
			}
			

	}

}
