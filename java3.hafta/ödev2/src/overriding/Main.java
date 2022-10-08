package overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediMenager[] krediMenagers = new BaseKrediMenager[] {new OgretmenKrediMenager(), new TarimKrediMenager(), new OgrenciKrediMenager()};
		
		for(BaseKrediMenager krediMenager:krediMenagers) {
			System.out.println(krediMenager.hesapla(2000));
		}
		
		
		

	}

}
