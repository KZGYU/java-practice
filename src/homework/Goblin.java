package homework;

public class Goblin implements Monster {

	String name;
	
	//コンストラクタ：　名前を引数にとり、初期化
	public Goblin(String name) {
		this.name=name;
		
	}
	
	
	public void attack() {
		System.out.println(this.name + "は、こん棒で攻撃した！");

	}

}
