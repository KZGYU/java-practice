package Practice11;

//11章　抽象クラス

public class Abstract {
	
	//抽象クラス概念及びコード
	/**
	 * 抽象クラスは継承関係にあり、処理の再利用をしたい時に使うもの
	 * 抽象クラスと具象クラスの「継承」関係はIS Aの関係
	 * 犬 IS A 動物＝犬は動物だ　のような親子関係
	 */
	public static void main(String[] args) {
		Human tarou = new Human("太郎");
		Dog pochi = new Dog("ポチ");
		
		System.out.println("******太郎の処理******");
		tarou.sleep();
		tarou.speak();
		tarou.eat();
		
		System.out.println("******ポチの処理******");
		pochi.sleep();
		pochi.speak();
		pochi.eat();
		
		
	}


}
