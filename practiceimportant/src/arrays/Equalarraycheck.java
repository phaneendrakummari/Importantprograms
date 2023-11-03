package arrays;

import java.util.Arrays;

public class Equalarraycheck {

	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5};
		int []b= {1,2,3,4,5};
		
		//System.out.println(Arrays.equals(a, b));
		
        boolean arrays=true;
        
        if(a.length==b.length)
        {
        	for(int i=0;i<a.length;i++)
        	{
        		if(a[i]!=b[i])
        		{
        			arrays=false;
        		}
        	}
        		
        }
        else 
        {
        	arrays=false;
        	
        }
        if(arrays==true)
        {
        	System.out.println("arrays are equal");
        }
        else
        {
        	System.out.println("arrays are not equal");
        }
		
		
		
	}

}
