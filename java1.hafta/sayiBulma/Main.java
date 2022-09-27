package sayiBulma;

public class Main {
	public static void main(String[] args) {
		int[] sayilar = {5,3,2,6,9};
		
		int aranacakSayi = 7;
		
		for(int i = 0; i<sayilar.length; i++) {
			if(aranacakSayi == sayilar[i]) {
				System.out.println(aranacakSayi + " vardir.");
				return;
			}
		}
		System.out.println(aranacakSayi + " yoktur.");
	}

}
