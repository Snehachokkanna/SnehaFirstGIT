package javaPrograms;

public class Example131 
{

	public void finalize()
	{
		System.out.println("Done");
	}
	public static void main(String[]  args) throws Exception
	{
		//1.Create an object to class
		Example131 obj = new Example131();
		//2.use that object to call properties and methods
		System.out.println(obj.hashCode());
		//3.make obj as NULL & call garbage collector method
		obj=null;
		System.gc();
		System.out.println("end of garbage collector");
	}
}
