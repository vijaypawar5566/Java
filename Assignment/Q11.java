//WAP to do following, there are two numbers given A & B. B is always less than A.
//Find sum of all numbers contained in A which are less than B.
//Ex. A = 10234  B = 25
//Numbers contained in A which are less than B
//1,2,3,4,10,23 
//Sum is 1+2+3+4+10+23 = 43

public class Q11 {
	public static void main(String[] args) {
		int big = 102345;
		int bigc = big;
		int small = 255;  //255
		int smallc = small;
		int cnt = 0;
		int scnt = 0;
		int add = 0;
		int limit = 1;
		// for counting small element
		while (small != 0) {
			small /= 10;
			scnt = scnt + 1;
		}
		// System.out.println(scnt + " small count");

		// finding limit
		for (int i = 0; i < scnt; i++) {
			limit *= 10;
		}
		 System.out.println(limit + " limit");

		// for counting large element
		while (big != 0) {

			int rem = big % 10;
			big /= 10;
			cnt = cnt + 1;
			if (rem < smallc) {
				add = add + rem;
			}
		}

		// System.out.println(add+" f");
		// System.out.println(bigc);
		// System.out.println(limit);

		while (bigc != 0) {

			int rem = bigc % limit; // 102345
			if (rem < smallc && rem > 9) { 
				add = add + rem;
			}
			bigc /= 10;
		}
		System.out.println(add);

	}

}




