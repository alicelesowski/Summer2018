/*
 * Alice Lesowski
 * CSCI 232
 * Data Structures and Algoriths
 * Homework 1
 * May 15 2018
 * This software takes an input file and prints it to the console with each word on a separate line.
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFile{
	
public static void main(String [] args){
	
	BufferedReader input = null;
	try{
		input = new BufferedReader(new FileReader("input/input.txt"));
		String line = null;
		while((line=input.readLine())!=null){
			String[] words = line.split(" ");
			for(int x=0; x<words.length; x++){
			System.out.println(words[x]);
			}
		}
			
	}
		catch(IOException x){
			System.err.format("IOException: %s%n", x);
	}
}
}