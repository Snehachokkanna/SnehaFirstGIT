package javaPrograms;

import java.util.Formatter;

public class Example28 {

	public static void main(String[] args) 
	{
		//About formatting ways
		//Way -1 (only to display formatted output in console)
		System.out.printf("My name is %s%n", "abdul kalam");

        // Way 2 (Get output into String Variable)

        Formatter f = new Formatter();

        f.format("Given Name  is (With Formater Class Object): %S", "Avinash Babau Chintala Chervu");

        String x = f.toString();

        System.out.println(x);

        //Way 3 (Get output into String Variable)

        String output = String.format("%S = %d", "SNEHA",26);

        System.out.println(output);

        //Way 4 (Get Output into String Variable)

        StringBuilder sbuf = new StringBuilder();

        Formatter fmt= new Formatter(sbuf);

        fmt.format("PI Value from Math (Static Class): %g %n", Math.PI);

        String y= sbuf.toString();

        System.out.println(y);
		
		
	}

}
