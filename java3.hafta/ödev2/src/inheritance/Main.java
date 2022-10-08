package inheritance;

public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		customer.age = 19;
		employee.id = 5632;
		
		CustomerMenager customerMenager = new CustomerMenager();
		EmployeeMenager employeeMenager = new EmployeeMenager();
		
		customerMenager.add();
		employeeMenager.bestEmployee();
		
		
	}

}
