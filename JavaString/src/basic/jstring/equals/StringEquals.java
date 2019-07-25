package basic.jstring.equals;

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// kiem tra 2 chuoi dung hay sai
		String a = "Java";
		String b = "JAVA";
		String c = "Java";
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		// ko phan biet chu hoa chu thuong 
		System.out.println(a.equalsIgnoreCase(b));
	}

}
