package test001;

public class Fool extends Character implements Human {
	
	String name="フール";
	
	public void attack(Monster m) {
		System.out.println(this.name+"は戦わずに遊んでいる");
		
	}
	
	public void talk() {
		System.out.println(this.name+"は、相手に話しかけた");
		
	}

	public void watch() {
		System.out.println(this.name+"は、近くにItemがないか探した");
		
	}
	
	public void hear() {
		System.out.println(this.name+"は、相手の話を聞いている");
		
	}
	


	@Override
	public void sleep() {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
