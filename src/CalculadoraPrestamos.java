/*//Calculadora de préstamos
//Le pides un préstamo a un amigo y necesitas calcular cuánto le deberás después de 3 meses.
//Vas a devolverle el 10% de la cantidad restante del préstamo cada mes.
//Crea un programa que tome la cantidad del préstamo como entrada, calcule y genere la cantidad restante después de 3 meses.
//
//Ejemplo de entrada:
//20000
//
//Ejemplo de salida:
//10628
//
//Aquí está el calendario de pagos mensuales:
//Mes 1
//Pago: 10% of 20000 = 2000
//Cantidad restante: 18000
//Mes 2
//Pago: 10% of 18000 = 1800
//Cantidad restante: 16200
//Mes 3:
//Pago: 10% of 16200 = 1620
//Cantidad restante: 14580
**/
import java.util.Scanner;
public class CalculadoraPrestamos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		//your code goes here
		int resto=(int)(amount*0.9*0.9*0.9);
		System.out.println(resto);
		
	}

}
