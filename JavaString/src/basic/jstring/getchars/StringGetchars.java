package basic.jstring.getchars;

public class StringGetchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] s =  new char [24];
		String a = "co mot nguoi ki su java web ";
		a.getChars(3, a.length()-1, s, 0);
		System.out.println(s);

	}

}
