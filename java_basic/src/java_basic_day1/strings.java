package java_basic_day1;

public class strings {

	public static void main(String[] args) {
		String mesaj = "bugün hava çok güzel";

		System.out.println(mesaj);
		System.out.println("eleman sayısı: " + mesaj.length());
		System.out.println("5. eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat(". yaşasın"));
		System.out.println(mesaj.concat(" " + mesaj));
		System.out.println(mesaj.startsWith("b"));
		System.out.println(mesaj.endsWith("z"));
		char[] karakterler = new char[4];

		mesaj.getChars(6, 10, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("a"));
		System.out.println(mesaj.lastIndexOf("a"));
		System.out.println(mesaj.replace(" ", "-"));
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2, 4));
		for (String sonuc : mesaj.split(" ")) {
			System.out.println(sonuc);

		}

		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.toLowerCase());
		
	}

}
