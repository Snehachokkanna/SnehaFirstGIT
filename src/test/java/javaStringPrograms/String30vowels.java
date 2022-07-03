package javaStringPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class String30vowels {

	public static void main(String[] args)
	{
		//Take a sentence
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String x =sc.nextLine();
		sc.close();
		//Create hash map to store "vowel chars" & "occurences of those chars" as pairs(key,value)
		HashMap<Character, Integer> hm =  new HashMap<Character,Integer>();
		hm.put('a',0);
		hm.put('e',0);
		hm.put('i',0);
		hm.put('o',0);
		hm.put('u',0);
		
		//if duplicates chars in different cases,then get that sentence into same case
		x=x.toLowerCase();
		
		//Split sentence  into chars array
		char[]chars =x.toCharArray();
		System.out.println("count of all chars " +chars.length);
		//process on each character in given String
		for(int i=0;i<chars.length;i++) //0(1s char) to length-1(last char)
		{
			if(hm.containsKey(chars[i]))//character match with vowels in Hash Map
			{
				hm.put(chars[i],hm.get(chars[i])+1);	
			}
		}
		System.out.println(hm);
		//find max occurences
		int max=0;
		for(char c : hm.keySet())
		{
			if(hm.get(c)>max)
			{
				max=hm.get(c);
			}
		}
		//find vowels which occured maximum times
		for(char c:hm.keySet())
		{
			if(hm.get(c)== max)
			{
				System.out.printf("vowel -%c has heighest occurences like %d%n",c,max);
			}
		}

	}

}
