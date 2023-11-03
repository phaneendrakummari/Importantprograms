package arrays;

public class Extractevenodd {

	public static void main(String[] args) {
		
		int [] a= {1,2,5,8,9,6,10};
	
		System.out.println("even numbers in array");
		
		
		for(int i=0;i<a.length;i++)     // 7
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
		
		System.out.println("odd numbers in array");
		
		for(int i=0;i<a.length;i++)     
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
			
		}
		
		// enchanced for loop
		
		
		
		
		

	}

}
