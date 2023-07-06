package test002;

public class prc001 {
	public static void main(String[] args) {
		int[][] ans ={ {1,2,3}, {4,5,6}};
		System.out.println(ans[0][1]);
		  System.out.println(ans[1][2]);
		  
		  for(int[] num : ans) {
			   for(int n: num) {
			    System.out.println(n);
			   }
			  }
	}

	
	
	
}
