package javaStringPrograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class String21ex {

	public static void main(String[] args)
	{
		//NOTE 1 : String to number
		
		String x = "100";
		int a=Integer.parseInt(x);
		float f =Float.parseFloat(x);
		System.out.println(a);
		System.out.println(f);
		
		 //NOTE 2 : Number to String
		
		int h =100;	
		String y= " z";
		y=y+x;
		System.out.println(y);
		
		//OR
		int u=100;
		String k= " ";
		k=k.valueOf(u);
		System.out.println(k);  
		
		
		//NOTE 3 : String to boolean
		String P ="true";
		boolean b =Boolean.parseBoolean(P);
		System.out.println(b);
		
		// NOTE 4 : Boolean to String
		
		boolean ü=true;
		String i = " ";
		y =y.valueOf(ü);
		System.out.println(y);
		
		//OR 
		boolean z=true;
		Boolean bobj = new Boolean(b);
		String E =bobj.toString();
		System.out.println(E);
		
		//String to char
		String R ="z";
		char c=x.charAt(0);
		System.out.println(R);
		
		//Char to String
		char p ='F'; 
		String j = " ";
		j=j+p;
		System.out.println(j);
		
		//OR
		char g ='Q';
		Character cobj = new Character(g);
		String d =cobj.toString();
		System.out.println(d);
		
		//OR
		char O='A';
		String r =" ";
		r=r.valueOf(O);
		System.out.println(r);
		
		//NOTE 7   : String to char Array
		String s ="magnitia";
		char o[]=s.toCharArray();
		System.out.println(o[3]);
		
		//OR
		String v="magnitia";
		char Q[]=new char[v.length()];
		for(int F=0;F<v.length();F++)
		{
			Q[F]=v.charAt(F);
			System.out.print(Q[F]);
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
