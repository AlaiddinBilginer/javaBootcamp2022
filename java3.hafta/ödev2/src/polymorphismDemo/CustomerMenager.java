package polymorphismDemo;

public class CustomerMenager {
	private BaseLogger baseLogger;
	
	public CustomerMenager(BaseLogger baseLogger) {
		this.baseLogger = baseLogger;
	}
	
	public void add() {
		System.out.println("Musteri eklendi.");
		baseLogger.log("Log mesaji");
		
	}
	
	
}
