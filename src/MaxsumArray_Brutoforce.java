
public class MaxsumArray_Brutoforce {

	public static void Maxsubarray(int numbers[]) {
		int current = 0;
		int Maxsum = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j < numbers.length; j++) {
				current = 0;
				for (int j2 = i; j2 <= j; j2++) {
					current += numbers[j2];
				}
				System.out.println(current);
				if (Maxsum < current) {
					Maxsum = current;
				}

			}

		}
		System.out.println("The Maxsum is : " +Maxsum);
	}

	public static void main(String[] args) {

		int numbers[] = { 1, -2, 6, -1, 3 };
		Maxsubarray(numbers);

	}

}
