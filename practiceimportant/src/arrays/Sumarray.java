package arrays;

public class Sumarray {

	public static void main(String[] args) {
		
		
		int []j= {2,5,1,9,6};
		
		int sum=0;
		
		/* for(int i=0;i<j.length;i++)        // 0 1
		{
			sum=sum +j[i];          // 2
			
					
		}*/
		
		for(int value:j)
		{
			sum=sum+value;
		}
		
		
		
		
        
		System.out.println("Sum of elements in an aarray:" +sum);
	}

}
  