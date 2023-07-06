package test001;

public class GAME_MAIN {
	public static void main(String[] args) {

		//------------勇者の情報------------------------------------------
		Hero h = new Hero();
		h.name = "ヒロ";
		System.out.println("勇者は" + h.name + "を生み出しました！");
		//---------------------------------------------------------------

		//------------超勇者の情報------------------------------------------
		//Heroクラスを継承
		SuperHero sh = new SuperHero();
		sh.name = "赤ヒロ";
		System.out.println("勇者から進化し、【超勇者】" + sh.name + "が誕生した！");
		//---------------------------------------------------------------

		//------------Itemの情報------------------------------------------
		Weapon w = new Weapon();
		System.out.println(sh.name + "は" + w.name + "を装備した！");
		//---------------------------------------------------------------

		//		//------------聖職者の情報---------------------------------
		//		Cleric c = new Cleric();
		//		c.name = "ヒラ";
		//		System.out.println("勇者は" + c.name + "を仲間にした！");
		//		System.out.println(Cleric.MAX_HP);
		//		//----------------------------------------------------------
		//
		//------------魔術師の情報------------------------------------
		//		Wizard z = new Wizard();
		Character c = new Wizard();
		//		Character c =z;
		Wizard z = (Wizard) c;//強制的にコンパイル
		c.name = "ウィズ";
		System.out.println("勇者は" + z.name + "を仲間にした！");
		//------------------------------------------------------------

		//------------剣の情報------------------------------------
		Sword s1 = new Sword();
		Sword s2 = new Sword(w.name);

		h.sword = s1;
		System.out.println("勇者の現在の武器は" + h.sword.name);

		sh.sword = s2;
		System.out.println("超勇者の現在の武器は" + sh.sword.name);
		//-------------------------------------------------------

		//------------敵の情報------------------------------------
		Matango m1 = new Matango();
		Matango m2 = new Matango('B');
		PoisonMatango pm = new PoisonMatango('A');
		//-------------------------------------------------------

		//------------愚者の情報------------------------------------------
		Fool f = new Fool();

		//---------------------------------------------------------------

		Character[] ct = new Character[3];
		ct[0] = new SuperHero();
		ct[1] = new Wizard();
		ct[2] = new Fool();

		Monster[] monsters = new Monster[1];
		monsters[0] = new Matango();

		//冒険のはじまり
		c.attack(m1);
		z.fireball(m1);//[z.fireball(m1);]では、エラーが発生。[Character]クラスでは、火の玉を攻撃するキャラが定義できないため
		sh.fly();
		sh.attack(m1);
		//		sh.attack(m1, s2);
		sh.land();
		//		h.sit(5);
		//		h.slip();
		//		h.sit(25);
		//		c.selfAid();
		//		c.pray(3);
		z.heal(sh);

		//		h.attack(m1, s);
		//		m1.defeat(h, s, m1);
		//		m1.run();
		//		m2.run();

		f.attack(m1);
		f.talk();
		f.watch();
		f.hear();
		f.run();

		h.run();
		sh.run();

		//宿屋に泊まる
		for (Character ch : ct) {
			ch.hp += 50;
			System.out.println(ch.name + "は50回復した");
			ch.hp += 50;
		}

	}

}
