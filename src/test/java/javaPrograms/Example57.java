package javaPrograms;

public class Example57 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k*2-1);
				
			}
			for(int l=i;l>1;l--)
			{
				System.out.print(l*2-3);
			}
			System.out.println();
		}
	

	}

}
