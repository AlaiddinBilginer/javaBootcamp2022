package classesWithAttributes;

public class Main {
	public static void main(String[] args){
		Product product = new Product("Laptop", "Asus laptop", 15000, 13, 5, "Siyah");
			
		/*
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Monster Laptop");
		product.setPrice(15000);
		product.setStockAmount(5);		
		*/
		ProductMenager productMenager = new ProductMenager();
		productMenager.add(product);
		System.out.println("Kod: " + product.getKod());
		
	}
}
