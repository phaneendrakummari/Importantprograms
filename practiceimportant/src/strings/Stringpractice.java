package strings;

public class Stringpractice {
	
	
	

	public static void main(String[] args) {
		
		
		
		String str = new String("hello      java world");
		str.length();

		System.out.println(str.length());
		System.out.println(str.charAt(8));
		System.out.println(str.toUpperCase());
		System.out.println(str.replace("a","w"));
		System.out.println(str.replaceAll("hello","hii"));    
		System.out.println(str.replaceAll(" ",""));
		
		
	}

}
