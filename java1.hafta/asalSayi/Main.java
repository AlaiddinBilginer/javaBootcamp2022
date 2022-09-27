package asalSayi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Asal olup olmadigini test etmek istediginiz sayiyi giriniz: ");
		int sayi = giris.nextInt();
		
		boolean asalMi = true;
		
		if(sayi <= 1) {
			System.out.println(sayi + " sayisi asal degildir.");
			return;
		}
		
		for(int i=2; i<sayi; i++) {
			if(sayi % i == 0) {
				asalMi = false;
			}
		}
		
		if(asalMi)
			System.out.println(sayi + " sayisi asaldir.");
		else
			System.out.println(sayi + " sayisi asal degildir.");
		
		
	}

}
