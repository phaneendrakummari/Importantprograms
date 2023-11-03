package task;

class Charctercount {

	public static void main(String[] args) {
		
		
		String str = "Technol0gy modern";
		int count=0;
		
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)!=' ') {
			   count++;	
			}
		}
		System.out.println("count of characters:"+count);

	}

}
