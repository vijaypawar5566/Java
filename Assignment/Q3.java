
//Write a Java method that accept a number from 
//the user and generates an
//integer between 1 and 7 and displays the name of the weekday.
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.println("Enter choice");
		
		do {
		ch = sc.nextInt();

		switch (ch) {
		case 1:System.out.println("Monday");
			break;
		case 2:System.out.println("Tuesday");
			break;
		case 3:System.out.println("wednesday");
			break;
		case 4:System.out.println("Thursday");
			break;
		case 5:System.out.println("Friday");
			break;
		case 6:System.out.println("Saturday");
			break;
		case 7:System.out.println("Sunday");
			break;
		default:System.out.println("invalid input");
		}
		}while(ch<=7);
	}
}
