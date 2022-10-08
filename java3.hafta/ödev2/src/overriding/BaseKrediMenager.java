package overriding;

public class BaseKrediMenager {
	public double hesapla(double tutar) { //final anahtar kelimesini ekleseydik, OgrenciKrediMenager sınıfında override işlemini yapamazdık.
		return tutar * 1.15;
	}

}
