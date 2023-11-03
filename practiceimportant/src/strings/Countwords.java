package strings;

public class Countwords {

	public static void main(String[] args) {
		
		String str = "ms dhoni is best player in world ";
		
		int count=1;
		
		for(int i=0;i<str.length()-1;i++)

		{
			if ( (str.charAt(i)==' ')  && (str.charAt(i+1)!=' ') )
            
            {
	            count++;
            	
             }
			
		
		}
		
		System.out.println("number of words in string: "+count);
	}
	
	 

}
