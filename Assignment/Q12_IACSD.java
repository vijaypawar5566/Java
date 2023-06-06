//WAP to find all substrings with min length 2 of given input string
//Ex. Input -> “IACSD” -> IA,AC,CS,SD,IAC,ACS,CSD,IACS,ACSD


public class Q12_IACSD {
	public static void main(String []args)
	{
		int a;
		
		    int i = 1, j = 0;
		    while (i != 0) {
		        i = (i<<1); j++;
		    }
		  System.out.println(j);
		
	}
}
