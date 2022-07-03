package javaPrograms;
import java.util.Scanner;



public class Example55a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter rows count");
			int n =Integer.parseInt(sc.nextLine());
			System.out.println("Enter Symbol");
			char c = sc.nextLine().charAt(0);
			sc.close();
			for(int i=1;i<=n;i++) //rows
			{
				for(int j=n-1;j>=i;j--)//spaces
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print(c);
				}
				System.out.println();
			}
	}

}
