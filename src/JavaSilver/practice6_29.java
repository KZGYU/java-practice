package JavaSilver;

public class practice6_29 {
	public static void main(String[] args) {
		practice6_29_Sample s = new practice6_29_Sample(10);
		modify(s.num);
		System.out.println(s.num);

	}

	private static void modify(int num) {
		num *= 2;
		System.out.println(num);

	}

}
