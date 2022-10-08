package encapsulation;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(3, "Monster", "Bilgisayar", 15000, 125);
		System.out.println(product.getCode());
		
		ProductMenager productMenager = new ProductMenager();
		productMenager.add(product);

	}

}
