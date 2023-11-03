package strings;

public class Palindronestring {

	public static void main(String[] args) {
		
		String str="radar";
		String orgstr=str;
		
		String rev = "";
		
			int leng=str.length();  
			
			System.out.println(leng);
			
			for(int i=leng-1;i>=0;i--)  
			{
				rev=rev+str.charAt(i);   
			}
			System.out.println(rev);  
			
			if(orgstr.equals(rev))
			{
				System.out.println(orgstr+"   given string is a palindrome");
			}
			else
			{
				System.out.println(orgstr+ "  given string is not a palindrome");

			}
			
		
		
	}

}
