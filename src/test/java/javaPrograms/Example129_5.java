package javaPrograms;

public class Example129_5 {

	public static void main(String[] args) 
	{
		int x =10;
		int y=0;
		try
		{
			int z=x/y;
			System.out.println(z);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage());
		}

	}

}
