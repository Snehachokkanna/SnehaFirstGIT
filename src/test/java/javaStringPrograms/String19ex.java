package javaStringPrograms;

import org.checkerframework.checker.units.qual.h;

import com.sun.org.apache.bcel.internal.generic.NEW;

import sun.net.www.content.audio.wav;

public class String19ex {

	public static void main(String[] args) 
	{
		String  x = "product value is RS:5678.78/- in India";
		String y =x.substring(8); //get data from 8th position to end
		System.out.println(y);
		
		String M =x.substring(8,20);//get data from 8th position to 19th position
		System.out.println(M);
		
		
		String W =x.substring(x.indexOf(':')+1,x.indexOf('/'));
		System.out.println(W);
		
		
		

	}

}
