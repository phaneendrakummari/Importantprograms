package strings;

public class Occurencestring {

	public static void main(String[] args) {
		
		
		String str = "Ms dhoni is a best player";
		
		//System.out.println(str.length());       // total length of string  
		
		
		
		int totallength=str.length();         // total length=26
		
		
		int totalremove=str.replace("a", "").length();     // total remove  = 24
		
		
		//System.out.println(str.replace("a", "").length());
		
		
		int count=totallength-totalremove;
		
		System.out.println(count);
		

	}

}
