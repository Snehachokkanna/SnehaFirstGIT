package Streamsjava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example10bRE {

	public static void main(String[] args) {
	

	

	String x ="India won 2nd World cup in 2011 After 28 years";
			
			//Seperate digits using RegularExpressions
			Pattern r =Pattern.compile("[A-Z][a-z]+"); //one or more digits
			Matcher  m =r.matcher(x);
			while(m.find())
			{
				System.out.println(m.group());
			}
	}
}
