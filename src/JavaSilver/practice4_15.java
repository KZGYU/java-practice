package JavaSilver;

public class practice4_15 {
	public static void main(String[] args) {
		int[] arrya = {1,2,3,4,5};
		int total = 0;
		for (int i:arrya) {
		  if(i%2==0)
			continue;
		  total+=i;
		  
			
		}	
		System.out.println(total);
	}

}
