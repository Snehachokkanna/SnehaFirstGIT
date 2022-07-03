package javaStringPrograms;

public class String11ex {

	public static void main(String[] args) 
	{
		String x  ="Kalam";
		String y ="kalam";
		int r1=x.compareToIgnoreCase(y);
		int r2=x.compareTo(y);
		System.out.println(r1);
		System.out.println(r2);

	}

}
