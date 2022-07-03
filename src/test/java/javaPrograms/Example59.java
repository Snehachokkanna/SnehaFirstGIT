package javaPrograms;

public class Example59 {

	public static void main(String[] args) {
		for(int i=5;i>=1;i--)
		{
			for(int k =4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i);j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
