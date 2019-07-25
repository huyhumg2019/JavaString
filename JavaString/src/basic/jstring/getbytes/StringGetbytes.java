package basic.jstring.getbytes;

public class StringGetbytes {

	public static void main (String [] args) {
		//tra ve mang byte cua chuoi
		String a = "ABCDEF";
		byte  mang []= a.getBytes();
		//mang  = a.getBytes();
		for(int i=0;i<mang.length;i++) {
			System.out.println(mang[i]);
		}
		
	}
}
