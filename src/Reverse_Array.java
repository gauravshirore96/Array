
public class Reverse_Array {
	
	public static void reversearray(int numbers[]) {
		int start = 0 , end = numbers.length -1;
		
		while (start<end) {
			int temp = numbers[start];
			numbers[start] = numbers[end];
			numbers[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int numbers[] = {2,3,4,5,6};
		reversearray(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();

	}

}
