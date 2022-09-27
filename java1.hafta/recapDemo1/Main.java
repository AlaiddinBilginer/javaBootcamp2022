package recapDemo1;

public class Main {
	public static void main(String[] args) {
		double sayi1 = 27.2;
		double sayi2 = 27.5;
		double sayi3 = 27.4;
		
		double enBuyuk = sayi1;
		
		if(sayi2 > enBuyuk) {
			enBuyuk = sayi2;
		}
		
		if(sayi3 > enBuyuk) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En buyuk sayi: " + enBuyuk);
	}

}
