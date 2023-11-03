package strings;

public class Removewhitespace {

	public static void main(String[] args) {
		 
		String str = "pha    nee                 indra ";
		
		System.out.println("before white spaces:"+str);
		
		
		str=str.replaceAll("  ","");
		
		System.out.println("after white spaces:"+str);
		

	}

}
