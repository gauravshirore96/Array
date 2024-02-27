
public class Pairs_in_Array {
	
	public static void pairsofarray(int numbers[]) {
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			
			int curr = numbers[i];//1,2,3,4,5
			for (int j = i+1; j < numbers.length; j++) {
				System.out.print("("+curr+ ", " +numbers[j] + ")");
				count++;
			}System.out.println();
			
		}System.out.println(count);
	}

	public static void main(String[] args) {
		
		int numbers[] = {1,2,3,4,5};
	
		pairsofarray(numbers);
		
	}

}
