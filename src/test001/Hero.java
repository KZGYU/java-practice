package test001;

public class Hero extends Character {
	String name;
	int hp;
	Sword sword;

	public Hero() {

		this.hp = 100;//hpフィールドを100で初期化

	}

	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");

	}

	//子クラスでオーバーライド禁止
	public final void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した");

	}

	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");

	}

	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("最終HPは" + this.hp + "でした");

	}

	//[Character]クラスによって実装されたメソッド
	public void attack(Monster m) {
		System.out.println(this.name + "は攻撃した！");
		//		System.out.println("おばけキノコ"+m1.suffix + "に" + s.damage + "のダメージをあたえた！");
		System.out.println("敵に10のダメージをあたえた！");
		m.hp -= 10;

	}

}
