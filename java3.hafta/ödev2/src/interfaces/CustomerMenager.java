package interfaces;

public class CustomerMenager {
	private ICustomerDal customerDal;
	
	public CustomerMenager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		//iş kodları
		customerDal.add();
	}

}
