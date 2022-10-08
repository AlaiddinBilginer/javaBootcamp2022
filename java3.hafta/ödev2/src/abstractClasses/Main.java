package abstractClasses;

public class Main {

	public static void main(String[] args) {
		//GameCalculator gameCalculator = new GameCalculator();//Hata verir.
		
		GameCalculator gameCalculator = new KidGameCalculator();
		gameCalculator.hesapla();

	}

}
