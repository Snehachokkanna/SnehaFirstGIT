package javaPrograms;

public class Example25 {

	public static void main(String[] args) 
	{
		long x = 1000 *60*60*24*365;
		long y = 1000 * 60*60*24*365L;
		System.out.println("x is Long with out Expansion identifier at end of expression \"L\" "+x); //Wrong output bcoz no L
		System.out.println("y is Long with  Expansion identifier at end of expression \"L\" "+y); //Correct

	  

	}

}
