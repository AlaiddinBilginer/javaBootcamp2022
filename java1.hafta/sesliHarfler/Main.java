package sesliHarfler;

public class Main {
	public static void main(String[] args) {
		char harf = 'İ';
		
		switch(harf) {
			case 'A':
			case 'I':
			case 'U':
			case 'O':
				System.out.println(harf + " kalin sesli harftir.");
				break;
				
			case 'E':
			case 'İ':
			case 'Ö':
			case 'Ü':
				System.out.println(harf + " ince sesli harftir.");
				break;
				
			default:
				System.out.println(harf + " bu harf sesli harf degildir.");
				break;
				
				
				
			
		}
		
	}

}
