package staticDemo;

public class ProductValidator {
	
	static {//birden fazla tanımlayabiliriz.
		System.out.println("Static yapici blok calisti."); 
	}
	
	public ProductValidator() {
		System.out.println("Yapici blok calisti.");
	}
	
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
