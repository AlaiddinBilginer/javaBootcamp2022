package staticDemo;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.price = 5000;
		product.name = "Laptop";
		
		ProductMenager productMenager = new ProductMenager();
		productMenager.add(product);
		
		DatabaseHelper.Crud.delete(); //Inner class, kullanılması önerilmez. Bir class sadece bir iş yapar.
		DatabaseHelper.Connection.createConnection(); 

	}

}
