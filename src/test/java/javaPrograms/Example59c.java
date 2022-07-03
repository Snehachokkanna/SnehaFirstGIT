package javaPrograms;

public class Example59c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upper triangle
		// TODO Auto-generated method stub
				for(int i=1;i<=5;i++)
				{
					for(int j=4;j>=i;j--)
					{
						System.out.print(" ");
					}
					for(int k =1;k<=i;k++)
					{
						System.out.print(k);
					}
					for(int l=i;l>1;l--)
					{
						System.out.print(l-1);
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
						System.out.print(k);
					}
					for(int l=i;l>1;l--)
					{
						System.out.print(l-1);
					}
					System.out.println();
				}
			

	}

}
