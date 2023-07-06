package Practice11;

/**
 * 
 * 「寝る」「話す」「食べる」の行動はどの動物も同じなので共通した抽象クラスで実装
    「話す」「食べる」は出来るが、具体的なことは動物によって異なるので、抽象メソッドとして定義。
 *
 */
public abstract class Animal {
	String name; 
	
	//コンストラクタ
	public Animal(String name) {//引数にString型を入れ、mainでnameを変数で取得する
		this.name=name;//nameは引数のString型変数に入れた値を取得される
	}
	
	//「寝る」はどの動物も共通行動なため、voidメソッドで出力
	public void sleep() {
		System.out.println("寝る");
		
	}
	
	//「話す」抽象メソッドとして定義し、オーバライドを各クラスで出力する
	public abstract void speak() ;
		
	//「食べる」抽象メソッドとして定義し、オーバライドを各クラスで出力する
	public abstract void eat();

	
	
}
