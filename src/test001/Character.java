package test001;

/**
 * [Character]クラスは抽象クラスとして宣言
 * すべてのキャラクターにはメンバとして、[run][attack]が存在する
 *
 */
public abstract class Character {
	String name;
	int hp;

	public void run() {
		System.out.println(this.name + "は逃げ出した");

	}

	//詳細未定のメソッド（抽象メソッド）を宣言
	public abstract void attack(Monster m);

}
