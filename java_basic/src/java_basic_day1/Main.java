package java_basic_day1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello world!");
		String ortaMetin="ilginizi çekebilir";
		String altMetin="vade süresi";
		System.out.println(ortaMetin);
		
		int vade=36;
		double dolarDun=18.23;
		double dolarBugun=18.23;
		
		boolean dolarDustuMu=false;
		String okYonu="";
		
		if (dolarBugun<dolarDun) {
			okYonu="down";
			System.out.println(okYonu);
			
		}
		else if(dolarBugun==dolarDun) {
			okYonu="equal";
			System.out.println(okYonu);
			
			
		}
		
		else {
			okYonu="up";
			System.out.println(okYonu);
		}
		
		String[] krediler= {"hızlı kredi" ,"maaş halkbank" ,"mutlu emekli"};
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}

}
