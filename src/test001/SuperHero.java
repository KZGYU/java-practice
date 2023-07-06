package test001;

//Heroクラスの継承
public class SuperHero extends Hero {
	boolean flying;

	public void attack(Monster m) {
//		super.attack(m1, sword);
		super.attack(m);
		if (this.flying) {
//			super.attack(m1, sword);
			super.attack(m);
		}
	}

	public void fly() {
		this.flying = true;
		System.out.println(this.name + "飛び上がった！");

	}

	public void land() {
		this.flying = false;
		System.out.println("着地した！");

	}

	//Heroクラスからrunをオーバライド
	public void run() {
		System.out.println(this.name + "は撤退した");
		System.out.println("最終HPは" + this.hp + "でした");

	}

}
