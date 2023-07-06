package homework05;

/**
 * Humanクラスの作成
・nameとageのprivateなインスタンスフィールドを持つ
・nameとageはgetterとsetterを介してアクセスする。
・コンストラクタで、nameとageの初期化をする
・toStringメソッドをオーバーライドして、以下の文字列を返却する
　　"私の名前は、〇〇で年は〇〇歳です"　
// 〇〇にはそれぞれ、インスタンスフィールドのnameとageを表示する。

Operationクラスの作成
・mainメソッドを作成し、Humanクラスをインスタンス化する。
・オーバーライドした、toStringメソッドをコンソール表示する。

追加
getter/setterを修正して以下を実現してください。

nameフィールドは読み取り専用にする。
ageフィールドは、0未満の値は設定しない。

※コンストラクへの設定は考慮不要です。
（コンストラクタの初期化の際は、nameへの設定や、
　ageへの0未満の設定はできてよい）


 */
public class Human {
	private int age;
	private String name;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;

		if (age < 0) {
			//IllegalArgumentExceptionは不正な引数、または不適切な引数
			//をメソッドに渡したことを示すためにスローされます。
			throw new IllegalArgumentException("年齢の入力が間違っていますので、処理を中断します");

		}

	}

	public String getName() {
		return name;
	}

	//　　　Nameフィールドを読み取り専用にする	
	//		public void setName(String name) {
	//			this.name = name;
	//		}

	public String toString() {

		return "私の名前は、" + name + "で年は" + age + "歳です";

	}

}
