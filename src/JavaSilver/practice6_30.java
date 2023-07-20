package JavaSilver;

public class practice6_30 {
	public static void main(String[] args) {
		practice6_30_Sample s = new practice6_30_Sample(10);
		modify(s);
		System.out.println(s.num);
	}
	private static void modify (practice6_30_Sample s) {
	 s.num*=2;
	
	}

}
