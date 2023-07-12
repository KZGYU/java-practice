package JavaSilver;

public class practice4_9_Sample {
	private int num;
	private String name;
	public practice4_9_Sample(int num,String name) {
		this.num=num;
		this.name=name;
		
	}
	
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		if(obj instanceof practice4_9_Sample) {
			practice4_9_Sample s= (practice4_9_Sample)obj;
			return s.num==this.num;
		}
		
		return false;
		
	}

}
