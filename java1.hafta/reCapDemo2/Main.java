package reCapDemo2;

public class Main {
	public static void main(String[] args) {
		double[] myList = {1.5, 3.2, 5.8};
		
		double total = 0;
		double max = myList[0];
		
		for(double number:myList) {
			if(max < number) {
				max = number;
			}
			
			total += number;
		}
		
		System.out.println("Total = " + total);
		System.out.println("Max = " + max);
		
	}

}
