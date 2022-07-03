package javaPrograms;

public class Example58 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<(2*i);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
