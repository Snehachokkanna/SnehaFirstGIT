package javaPrograms;

import java.util.Random;
import org.apache.commons.lang.RandomStringUtils;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.omg.CORBA.PUBLIC_MEMBER;

public class Example124Random {

	public static void main(String[] args) 
	{
		//Random Number 
		Random r = new Random();
		System.out.println(r.nextInt());
		//Random String (alphabet)
		String str1 = RandomStringUtils.randomAlphabetic(10);
		System.out.println(str1);
		//Random String (alpha numeric)
		String Str2 = RandomStringUtils.randomAlphanumeric(10);
		System.out.println(Str2);
	}

}
