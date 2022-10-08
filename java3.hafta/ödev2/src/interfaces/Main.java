package interfaces;

public class Main {
	public static void main(String[] args) {
		//ICustomerDal customerDal = new ICustomerDal(); //Hata verir.
		
		/*ICustomerDal customerDal = new OracleCustomerDal();
		customerDal.add();*/
		
		CustomerMenager customerMenager = new CustomerMenager(new MySqlCustomerDal());
		customerMenager.add();
		
		
	}
	
	

}
