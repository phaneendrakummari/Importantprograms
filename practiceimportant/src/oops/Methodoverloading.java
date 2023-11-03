package oops;

public class Methodoverloading {
	int a;
	int b;
	
	public void sum() {
		a=30;
		b=50;
		System.out.println(a+b);
	}
	public void sum(int x,int y) {
		
		a=x;
		b=y;
		System.out.println(x+y);
	}
	public void sum(int x,int y,int z) {
		System.out.println(x+y+z);
	}
	public void sum(int x,double y) {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		
		Methodoverloading mol = new Methodoverloading();
		mol.sum(12,12.4);
	}
	
	/*public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(int a,int b ,int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		Methodoverloading cal=new Methodoverloading();
		cal.add(20, 30);
		cal.add(40, 50, 60);
		
	}*/
}
