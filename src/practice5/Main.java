package practice5;

public class Main {
	public static void main(String[] args) {
		String[][] arrya = { { "A", "B" }, null, { "C", "D", "E" } };
		int total = 0;
		for (String[] tmp : arrya) {
			total += tmp.length;
		}
		System.out.println(total);
	}

}
