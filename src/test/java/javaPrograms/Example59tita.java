package javaPrograms;

import com.sun.javafx.image.BytePixelSetter;

public class Example59tita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ship smoke tunnel
		System.out.println();
		System.out.println("                           _");
		System.out.println("                          | |");
		System.out.println("                          | |");
		//part-1(top horizontal line)
		for(int i=1;i<=40; i++)
		{
			System.out.print("-");
		}
		System.out.println(); 
		//part-2(left and right edges) 
		int FLAG=0;
		for(int i=1;i<= 5; i++)
			{
				for(int j=1; j<=40; j++)
				{
				if(j<=i)
				{
					System.out.print(" ");
				}
				else if(j==i+1)
				{
					System.out.print("\\");
				}
				else if(j==40-i)
				{
					System.out.print("/");
				}
				else if (i==3 && FLAG==0)
				{
				System.out.print("          TITANIC");
				FLAG=1;
				j=j+16;
				}
				else
				{
					System.out.print(" ");
				}
				}
				System.out.println();
			}
			//part -3 (bottom horizontal line
			System.out.print("      ");
				for(int i=1;i<=28;i++)
				{
					System.out.print("-");
				}
		
	}
}
