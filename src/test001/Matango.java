package test001;

public class Matango extends Monster {
	static final int LEVEL = 10;
	char suffix;

	public Matango() {
		this.hp = 50;
		this.suffix = 'A';

	}

	public Matango(char suffix) {
		this.hp = 48;
		this.suffix = suffix;

	}

	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;

	}

	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "逃げ出した！");
	}

	public void defeat(Hero h, Sword s, Matango m1) {
		int defeatmath = m1.hp - s.damage;
		System.out.println("お化けキノコ" + m1.suffix + "の残りのHPは" + defeatmath + "です。");

	}

}
