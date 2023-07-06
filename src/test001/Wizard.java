package test001;

public class Wizard extends Character {
	int mp;

	public Wizard() {
		this.hp = 50;
		this.mp = 20;

	}

	public void fireball(Monster m) {
		System.out.println(this.name + "は火の玉を放った！");
		System.out.println("敵に20ポイントのダメージ");
		m.hp -= 20;
		this.mp -= 5;
	}

	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した！");

	}

	@Override
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃!");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
		
	}

}
