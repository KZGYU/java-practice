package homework;

public class Wolf implements Monster {

	String name;
	
	//コンストラクタ：　名前を引数にとり、初期化する
	public Wolf(String name) {
		this.name=name;
		
	}
	
	public void attack() {
		System.out.println(this.name + "は、するどい爪で攻撃した！");
		
	}
	
	
	

}
