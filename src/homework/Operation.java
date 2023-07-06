package homework;
/**
 * インターフェース名：Monster

・抽象メソッド：attack

　→引数、戻り値ともに不要

実装クラス：Goblin

・コンストラクタ：　名前を引数にとり、初期化する

・Monsterインターフェースを実装して、attackメソッドを実装する。
（中身は、初期化した名前で攻撃する旨表示する）

実装クラス：Wolf

・コンストラクタ：　名前を引数にとり、初期化する

・Monsterインターフェースを実装して、attackメソッドを実装する。
（中身は、初期化した名前で攻撃する旨表示する）

操作クラス：Operation

・GoblinとWolfのインスタンスをMonsterインターフェースの型に格納し、
attackメソッドを実行する（多態性の利用）
 * 
 */
public class Operation {
	public static void main(String[] args) {
		
		Monster[] monsters = new Monster[2];
		monsters [0]= new  Goblin("ゴブリン");
		monsters [1]= new  Wolf("ウルフ");
		
		for (Monster m : monsters) {
			m.attack();
		}
		
		
		
	}

}
