package java_basic_day1;

public class demo2 {

	public static void main(String[] args) {
		double total=0;
		
		double[] myList= {1.2,1.3,4.3,5.6};
		double max=myList[0];
		for (double number : myList) { 
			if (max<number) {
				max=number;
			}
			total=total+number;
			System.out.println(number);
		}
		System.out.println("toplam sayı:" +total);
		System.out.println("en büyük sayı: " +max);
		

	}

}
