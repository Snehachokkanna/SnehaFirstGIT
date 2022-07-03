package javaStringPrograms;

public class StringEx33 {

	public static void main(String[] args) 
	{
		String x = "abdul kalam";
		String y = " "; //Empty String
		for(int i=x.length()-1;i>=0;i--)
		{
			char c=x.charAt(i);
			y=y+c;
			
		}
		System.out.println(y);
	}

}
