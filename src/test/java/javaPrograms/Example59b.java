package javaPrograms;

public class Example59b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k =1;k<=i;k++)
			{
				System.out.print(2*k-1);
			}
			for(int l=i;l>1;l--)
			{
				System.out.print(2*l-3);
			}
			System.out.println();	
		}
		for(int i=4;i>=1;i--)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k =1;k<=i;k++)
			{
				System.out.print(2*k-1);
			}
			for(int l=i;l>1;l--)
			{
				System.out.print(2*l-3);
			}
			System.out.println();
		}
		
	}

}
