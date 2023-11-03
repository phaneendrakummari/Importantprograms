package task;
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a character");
		
		char ch=sc.next().charAt(0);
		
		char lowercase=Character.toLowerCase(ch);
		
		System.out.println("the entered charater after converting "+lowercase);
		
		switch(lowercase){
		//a e i o u
		case 'a': System.out.println("vowel");break;
		case 'A': System.out.println("vowel");break;
		case 'e': System.out.println("vowel");break;
		case 'i': System.out.println("vowel");break;
		case 'o':System.out.println("vowel");break;
		case 'u':System.out.println("vowel");break;
		
		default : System.out.println("consonant");
		
		}
		
		
	}
}


