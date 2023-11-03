package practiceimportant;

public class Admin {

	public static void main(String[] args) {
		
		
		Guest gue= new Guest();
		gue.read();
		
		Developer dev = new Developer();
		dev.read();
		dev.write();
		
		User use = new User();
		use.read();
		use.write();
		use.manage();

	}

}
