package strings;

public class REMOVEspecialc {

	public static void main(String[] args) {
		
		String S;
		String str =" 1@$%#%^$&^%*       Selenium ^$^&%&* with &(*&(*& java";
		
		S=str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(S);
		
		
	}

}
