import java.util.Scanner;
public class TimeConverter {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Time Converter
//		You need a program to convert days to seconds.
//		The given code takes the amount of days as input. Complete the code to convert it to seconds and output the result.
//
//		Sample Input:
//		12
//
//		Sample Output:
//		1036800
		System.out.println("Escribe el nùmero de dias");
		int days = scanner.nextInt();
		System.out.println(days*24*60*60);
	}

}
