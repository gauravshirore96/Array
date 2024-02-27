
public class print_subarray {

	public static void printsubarray(int numbers[]) {
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j < numbers.length; j++) {
				for (int j2 = i; j2 <= j; j2++) {
					System.out.print(numbers[j2]);
				}
				count++;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println(count);
	}

	public static void main(String[] args) {

		int numbers[] = { 1, 2, 3, 4, 5 };
		printsubarray(numbers);

	}

}
