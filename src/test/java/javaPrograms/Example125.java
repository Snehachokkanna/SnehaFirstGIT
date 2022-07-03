package javaPrograms;

//import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example125
{

	public static void main(String[] args)
	{
		Date dt1 = new Date();
		SimpleDateFormat f = new SimpleDateFormat("dd/MMM/YYYY hh-mm-ss");
		String strDate = f.format(dt1);
		System.out.println(strDate);

	}

}
