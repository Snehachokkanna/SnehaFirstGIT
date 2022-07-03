package Streamsjava;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;


public class Example10aRE {

	public static void main(String[] args) {
		String x ="India won 2nd world cup in 2011 after 28 years";
		
		//Separate digits using RegularExpressions
		Pattern r =Pattern.compile("[0-9]+"); //one or more digits
		Matcher  m =r.matcher(x);
		while(m.find())
		{
			System.out.println(m.group());
		}
		

	}

}
