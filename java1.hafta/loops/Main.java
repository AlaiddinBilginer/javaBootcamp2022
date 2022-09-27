package loops;

public class Main {
	public static void main(String[] args) {
		//for
		for(int i=10; i>=1; i-=2) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------------");
		
		//while
		int i = 10;
		while(i>=0) {
			System.out.println(i);
			i-=2;
		}
		
		System.out.println("--------------------------------");
		
		//do while
		i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
		
		//Do while döngüsünde şart ne olursa olsun ilk olarak döngünün içerisine girer sonra şarta bakar. Eğer şart sağlanmıyorsa döngüden çıkar.
		
	}

}
