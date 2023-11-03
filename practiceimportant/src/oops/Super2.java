package oops;

public class Super2 extends Super {
	
	

	 String car="tata";
	 int carnum=10928;
	 
	 void show() {
		 
		 
		 
		 System.out.println(car);
		 System.out.println(carnum);
		 System.out.println(super.car);
	 }
	 
	 public static void main(String[] args) {
		 Super2 sp = new Super2();
		 sp.show();
	 }
}
