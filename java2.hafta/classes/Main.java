package classes;

public class Main {

	public static void main(String[] args) {
		//reference type
		//stack-heap
		//garbage collector
		CustomerMenager customerMenager = new CustomerMenager(); 
		CustomerMenager customerMenager2 = new CustomerMenager();
		customerMenager = customerMenager2;
		
		customerMenager.add();
		customerMenager.update();
		customerMenager.remove();
		
		//value
		int number1 = 10;
		int number2 = 20;
		number1 = number2;
		number1 = 30;
		System.out.println(number2);
		
		//reference type
		int[] numbers1 = {1,2,3};
		int[] numbers2 = {4,5,6};
		numbers2 = numbers1;
		numbers1[0] = 10;
		System.out.println(numbers2[0]);
		System.out.println(numbers2[1]);
		
	}

}
