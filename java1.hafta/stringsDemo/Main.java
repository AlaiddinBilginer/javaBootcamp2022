package stringsDemo;

public class Main {
	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel";
		
		/*
		System.out.println("Karakter sayisi: " + mesaj.length());
		System.out.println("5.Eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat(". Yasasin!"));
		System.out.println(mesaj.startsWith("bu")); //case sensitive
		System.out.println(mesaj.endsWith("el"));
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.lastIndexOf('a'));
		*/
		
		String mesaj2 = mesaj.replace(' ', '-');
		System.out.println(mesaj2);
		
		System.out.println(mesaj.substring(6));
		System.out.println(mesaj.substring(0,5));
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim()); //boşlukları siler.
	}

}
