package javaPrograms;

public class Examplestringdoubt {

	public static void main(String[] args)
	{
		String x1 = new String("abdul kalam");
		String x2 = new String("abdul kalam");
		
		
		String x = "sneha";
		String y = "sneha";
		
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x);
		System.out.println(y);
		
		if(x==y)
		{
			System.out.println("same ");
			
		}
		else
		{
			
			System.out.println("Not same");
		}
		
		System.out.println(x1.hashCode());
		System.out.println(x2.hashCode());
		System.out.println(x1);
		System.out.println(x2);
		
		if(x1==x2)
		{
			System.out.println("same ");
			
		}
		else
		{
			
			System.out.println("Not same");
		} 
		
		if(x1.equals(x2))
		{
			System.out.println("same ");
		}
		
		else
		{
			
			System.out.println("Not same");
		}
		// TODO Auto-generated method stub

	}

}
