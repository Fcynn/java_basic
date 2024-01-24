package java_basic_day1;

public class arrays {

	public static void main(String[] args) {
		String[] ogrnciler= {"engin","derin","salih"};
		for (int i = 0; i < ogrnciler.length; i++) {
			System.out.println(ogrnciler[i]);
		}
		System.out.println("döngü bitti");
		
		
		for (String ogrenci : ogrnciler) {
			System.out.println(ogrenci);
		}
		

	}

}
