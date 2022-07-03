package javaStringPrograms;

public class StringEx33a {

	public static void main(String[] args)
	{
		String x ="abdul kalam";
		StringBuffer sb = new StringBuffer(x);
		StringBuffer y =sb.reverse();
		System.out.println(y);
		if(x.equals(y))
		{
			System.out.print("pallindrome");
		}
		
		else
		{
			System.out.print(" not pallindrome");
		}

	}

}
