
public class Largest_and_Smallest_value {
	
	public static int largestvalue(int numbers[]) {
		
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (largest < numbers[i]) {
				largest = numbers[i];
			}
			
			if (smallest> numbers[i]) {
				smallest=numbers[i];
			}
		}
		System.out.println("The Smallest Number is " + smallest);
		return largest;
	}

	public static void main(String[] args) {
		int numbers[] = {10,20,30,40,50,60};
		
		System.out.println("The largest Number is " + largestvalue(numbers));

	}

}
