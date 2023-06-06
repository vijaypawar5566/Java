 //WAP to separate prime numbers and non prime numbers from given array of numbers


	import java.util.*;

	public class Q13 {
		public static void main(String[] args) {
			int[] a = new int[5];
			int cnt = 0;
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < 5; i++) {
				System.out.println("Enter Value");
				a[i] = sc.nextInt();
			}
			System.out.println("Done");

			for (int i = 0; i < a.length; i++) {
				

				for (int j = 1; j < a[i]; j++) {
					if (a[i]%j==0) {
						cnt = cnt + 1;
					}

				}
				if (cnt < 3) {
					System.out.println("Prime: "+a[i]);
				}
				else
				{
					System.out.println("Not Prime: "+a[i]);
				}
				cnt = 0;

			}

		}

	}
