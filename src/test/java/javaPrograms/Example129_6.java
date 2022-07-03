package javaPrograms;

public class Example129_6 {

	public static void main(String[] args) 
	{

		int x =10;
		int y=0;
		try
		{
			int z=x/y;
			System.out.println(z);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

	}

}
