package java_basic_day1;

public class demo1 {

	public static void main(String[] args) {
		int sayi1=40;
		int sayi2=35;
		int sayi3=30;
		
		if (sayi1>sayi2 & sayi1>sayi3) {
			System.out.println("en buyuk sayı: "+sayi1);
		}
		else if (sayi2>sayi1 & sayi2>sayi3) {
			System.out.println("en buyuk sayi: "+sayi2);
			
		}
		else {
			System.out.println("en buyuk sayi: "+sayi3);
		}

	}

}
