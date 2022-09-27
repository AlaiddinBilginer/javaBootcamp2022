package classesWithAttributes;

public class Product {
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private int id;
	private String renk;
	private String kod;
	
	public Product(String name, String description, double price, int stockAmount, int id, String renk) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.id = id;
		this.renk = renk;
	}
	
	public Product() { //overloading
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0,1) + id;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
