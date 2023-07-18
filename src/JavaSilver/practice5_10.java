package JavaSilver;

public class practice5_10 {
	public static void main(String[] args) {
		int[][] arrayA = { { 1, 2 }, { 1, 2 }, { 1, 2, 3 } };
		int[][] arrayB = arrayA.clone();
		int total = 0;
		for (int[] tmp : arrayB) {
			for (int val : tmp) {
				total += val;
			}
		}
		System.out.println(total);
	}

}
