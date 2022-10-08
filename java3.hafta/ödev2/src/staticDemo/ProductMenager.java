package staticDemo;

public class ProductMenager {
	public void add(Product product) {
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}
		else {
			System.out.println("Urun bilgileri gecersizdir.");
		}
		
		//ProductValidator productValidator = new ProductValidator();//Yapıcı bloğun çalışmasını böyle sağlayabiliriz.
		//C#'da bu durum geçerli değildir. Static ile de yapıcı blok çalışır.
	}

}
