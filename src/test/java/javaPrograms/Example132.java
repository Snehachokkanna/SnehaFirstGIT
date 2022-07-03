package javaPrograms;

public class Example132  extends Thread
{

	public static void main(String[] args) 
	{
		work1 obj1 = new work1();
		work2 obj2 = new work2();
		work3 obj3 = new work3();
		obj1.start();
		obj2.start();
		obj3.start();
	}

}
