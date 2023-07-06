package Practice11;

public class Dog extends Animal {

	//コンストラクタ
	public Dog(String name) {
		super(name);//親クラス「Animal」から参照
	
	}

	
	public void speak() {
		System.out.println("私の名前は"+this.name+"だワン！");
		
		
	}

	
	public void eat() {
		System.out.println("ガブガブガブ");
		
	}

}
