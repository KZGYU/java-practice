package JavaSilver;

public class practice4_8_Main {
	public static void main(String[] args) {
		
	practice4_8_Sample s1 = new practice4_8_Sample(10);
	practice4_8_Sample s2 = s1;
	s1=new practice4_8_Sample(10);
	System.out.println(s1==s2);

	}
	
}
