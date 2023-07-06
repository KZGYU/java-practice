package test001;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	static final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	public Cleric() {
		this.hp = 50;
		this.mp = 10;

	}
	
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.hp = MAX_HP;
		this.mp -= 5;
		System.out.println("HPが最大まで回復した");
	}

	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間天に祈った！");
		Random random = new Random();
		int recover = 0;
		recover = random.nextInt(5) + sec;
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);

		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;

	}



}
