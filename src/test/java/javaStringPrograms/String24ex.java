package javaStringPrograms;

public class String24ex {

	public static void main(String[] args) 
	{
	//upper triangle
		for(int i=1;i<=5;i++) //1 to 5
		{
			for(int j=4;j>=i;j--) //4 to 1
			{
				System.out.print(" ");
			}
			char c1='A';
			for(int k=1;k<=i;k++)
			{
				System.out.print(c1);
				c1=(char)(c1+1); //increase Ascii value
			}
			//for right triangle
			char c2='A';
			for(int m=i-1;m>=1;m--)
			{
				System.out.print((char)(c2+m-1));
			}
			System.out.println();	
		}
		//Lower Triangle
		for(int i=4;i>=1;i--) //4 to 1
		{
			//for spaces
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			//for left triangle
			char c1='A';
			for(int k =1;k<=i;k++)
			{
				System.out.print(c1);
				c1=(char)(c1+1);
			}
			//for right triangle
			char c2='A';
			for(int m=i-1;m>=1;m--)
			{
				System.out.print((char)(c2+m-1));
			}
			System.out.println();
		}
	


	}

}
