package strings;

public class Reverse {

	public static void main(String[] args) {
		
		String str ="Phaneendra techonlogy";
	    String rev = "";
		
		int leng=str.length();     // 10
		
		System.out.println(leng);
		
		for(int i=leng-1;i>=0;i--) //  9 8 7 6 5 4 3 2 1 0 
		{
			rev=rev+str.charAt(i);   // a r d n e e n a h p
		}
		System.out.println(rev);  
		
		
		//StringBuffer sb = new StringBuffer(str);
		//System.out.println(sb.reverse());
		

	}

}
