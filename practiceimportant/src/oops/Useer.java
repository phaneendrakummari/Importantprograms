package oops;

public class Useer {

	public static void main(String[] args) {
		
		Lenovo len = new Lenovo();
		len.copy();
		len.paste();
		
		Dell del = new Dell();
		del.copy();
		del.cut();
		del.keyboard();
		
		HP hp1 = new HP();
		hp1.cut();
		hp1.copy();
		hp1.keyboard();
		hp1.paste();
		
		
	}

}
