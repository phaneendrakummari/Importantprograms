package encapsulation;

public class Accountbank {

	private long accno;
	private String email,name;
	private long phone;
	
	
	public void setaccno(long num) {
		accno=num;
	}
	public long getaccno() {
		return accno;
	}
	public void setemail(String mail,String nam) {
		email=mail;
		name=nam;
	}
	public String getemail() {
		return email;
	}
	//public void setname(String nam) {
	//	name=nam;
	//}
	public String getname() {
		return name;
	}
	public void setphone(long mobile) {
		phone=mobile;
	}
	public long getphone() {
		return phone;
	}
	
	
	
}
