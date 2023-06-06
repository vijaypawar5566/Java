//WAP to check is number is Amstrong number or not

import java.math.BigDecimal;
import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = num1;
		int num3=num1;
		int count = 0;
		int tot = 1;
		int add = 0;

		while (num1 != 0) {
			count = count + 1;
			num1 /= 10;
		}
	

		while (num2 != 0) {
			int rem = num2 % 10;
			for (int i = 1; i <= count; i++) {
				tot = tot * rem;
			}
			num2 /= 10;
			add = add + tot;
			tot = 1;
		}
		if(num3==add)
		{
		System.out.println("Aramstrong Number.");
		System.out.println("Calculated value "+add+".");
		}
		else
		{
			System.out.println("Not a armstrong Number.");
			System.out.println("Calculated value "+add+".");
		}
	}
}
