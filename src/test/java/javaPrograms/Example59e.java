package javaPrograms;

public class Example59e {

	public static void main(String[] args) {
		
		for(int i =1;i<=40;i++)//upper line
		{
			System.out.print("-");
		}
		System.out.println();
		
		for (int a=1;a<=10;a++)// Rows
		{
			for(int j=1;j<=40;j++)// Columns
			{
				if(j==1||j==40)
				{
					System.out.print("|");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
		for(int l =1;l<=40;l++)// Lower Line
		{
			System.out.print("-");
		}

	}

}
