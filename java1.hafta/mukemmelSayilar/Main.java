package mukemmelSayilar;

public class Main {
	public static void main(String[] args) {
		int mukemmelSayi = 28;
		int total = 0;
		
		for(int i=1; i<mukemmelSayi; i++) {
			if(mukemmelSayi % i == 0) {
				total+=i;
			}
		}
		
		if(total == mukemmelSayi)
			System.out.println(mukemmelSayi + " mukemmel sayidir.");
		else 
			System.out.println(mukemmelSayi + " mukemmel sayi degildir.");
		
	}

}
