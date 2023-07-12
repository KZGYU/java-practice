package JavaSilver;

public class practice4_10_Sample {
	private int num;
	public practice4_10_Sample(int num) {
		this.num=num;
	}
	public boolean equals(practice4_10_Sample obj) {
		if (obj == null) {
			return false;
		}
		return this.num==obj.num;
		
	}

}
