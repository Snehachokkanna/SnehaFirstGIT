package javaPrograms;

import java.util.Arrays;
import java.util.List;

public class Example122Arrco {

	public static void main(String[] args) 
	{
		//array input
		String playersArray[] = { "Virat","Sachin","Rohith","Bumrah","Rahul"};
		//Converting array into collection with asList() method
		List<String> playerList = Arrays.asList(playersArray);
		//print converted elements in collection
		System.out.println("converted elements :"+playerList);
		

	}

}
