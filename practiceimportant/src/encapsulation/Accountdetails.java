package encapsulation;

public class Accountdetails {

	public static void main(String[] args) {
		Accountbank ab = new Accountbank();
		ab.setaccno(100158946);
		ab.setemail("indraphanee@gmail.com","phaneendra");
		//ab.setname("phaneendra");
		ab.setphone(955023073);
		System.out.println(ab.getaccno());
		System.out.println(ab.getemail());
		System.out.println(ab.getname());
		System.out.println(ab.getphone());

		
	}

}
