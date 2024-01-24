package java_basic_day1;

public class switch_case {

	public static void main(String[] args) {
		char grade = 'B';
		switch (grade) {
		case 'A':
			System.out.println("mükemmel: Geçtiniz");
			break;
		case 'B':
			System.out.println("çok güzel: Geçtiniz");
			break;
		case 'C':
			System.out.println("iyi: Geçtiniz");
			break;
		case 'D':
			System.out.println("kötü: Kaldınız");
			break;

		default:
			System.out.println("geçersiz not  girdiniz");
			break;
		}

	}

}
