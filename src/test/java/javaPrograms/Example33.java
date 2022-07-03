package javaPrograms;

import java.util.Formatter;

public class Example33 {

	public static void main(String[] args)
	{
		//about ".precision" 
		//A precision specifier can be applied to the %f, %e, %g, and %s format specifiers. I
		Formatter f=new Formatter(); 
		// Format 4 decimal places with rounding.
		f=new Formatter();
		f.format("%.4f",123.1237567);
		System.out.println("Decimal floating-point notation to 4 places: "+f);

		//Display at most 15 characters (from left side) in a string.
		f=new Formatter();
		f.format("%.15s", "adulkalamsirindia");
		System.out.println("String notation to 15 places: "+f);

	}

}
