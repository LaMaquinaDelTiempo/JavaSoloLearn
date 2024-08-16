import java.util.Scanner;
public class GeetinUserInput {
	private static Scanner myVar = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//While Java provides many different methods for getting user input, the Scanner object is the most common, and perhaps the easiest to implement. Import the Scanner class to use the Scanner object, as seen here:
	System.out.println("Escribe tu nombre");
	System.out.println("Hola "+ myVar.nextLine());
	//importante se debe cerrar el objeto que realiza la entrada de datos
	myVar.close();
	}

}
