package task;

import java.util.Scanner;

public class Vowelsconstants {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter alphabet:");
		 
		char c = sc.next().charAt(0);
		
		switch(c)
		{
		case 'a','A':
		case 'e','E':
		case 'i','I':
		case 'o','O':
		case 'u','U':
			   System.out.println(c +": is a vowel");
			break;
			default:
				 System.out.println(c + ":is a consonant");
		}
		
			
			
		
		
		
	}

}
