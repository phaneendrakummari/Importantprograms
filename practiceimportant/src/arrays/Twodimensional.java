package arrays;

public class Twodimensional {

	public static void main(String[] args) {
		
		int[][]a=new int [3][2];
		
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		a[2][0]=5;
		a[2][1]=6;
		
	
		for(int i=0;i<a.length;i++) {
			
			int[] sinrow=a[i];
			for(int j=0;j<sinrow.length;j++) 
			{
				System.out.println(sinrow[j]+"  ");
			}
			System.out.println( );
			
					}

	}

}
