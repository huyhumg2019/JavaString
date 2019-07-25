package basic.jstring.indexof;

public class StringIndexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc def ghd";
		// tra ve gia tri index trong chuoi
		int indexA = a.indexOf("gh");
		System.out.println(indexA);
		//tra ve gtri index trong chuoi bat dau tu index =3>>
		int indexB = a.indexOf("e", 3);
		System.out.println(indexB);
		//
		int indexC = a.indexOf("e");
		System.out.println(indexC);
	}

}
