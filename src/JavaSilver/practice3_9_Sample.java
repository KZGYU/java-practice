package JavaSilver;

public class practice3_9_Sample {
	private int num;
	private String name;
	public practice3_9_Sample(int num,String name) {
		this.num=num;
		this.name=name;
		
	}
	
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		if(obj instanceof practice3_9_Sample) {
			practice3_9_Sample s= (practice3_9_Sample)obj;
			return s.num==this.num;
		}
		
		return false;
		
	}

}
