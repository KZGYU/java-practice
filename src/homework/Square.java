package homework;

public class Square {

	/**コンストラクタ
	 クラスからオブジェクトを作成した際に、
	 自動的に実行されるメソッドのことで、メンバ変数の初期化などの主に行います。  
	 */

	/**クラスメソッド(staticメソッド)
	 * クラスに紐付けられたメソッドであり、クラス全体に関連する処理を定義します。
	   別名「静的メソッド」とも呼ばれており、「static」と明示する必要があります。
	   クラスメソッドからは直接後述するインスタンスメソッドやインスタンスフィールドを呼び出すことは出来ず、
	   クラスをインスタンス化して呼び出すことが必要です。
	 */

	/**インスタンスメソッド
	 * インスタンスメソッドは名前の通り、インスタンスに紐付けられたメソッドであるため、
	 * クラスからインスタンスを生成しないと利用することが出来ません。
	 */

	int height;
	int wight;
	
	//コンストラクタ
	public Square(int height,int wight) {
//		this.height = 10;
//		this.wight = 20;

		this.height=height;
		this.wight=wight;
		
	}

	//クラスメソッド
	public static void info() {
		System.out.println("このクラスは、面積を求めるクラスです。");

	}

	//インスタンスメソッド
	public int area() {
		
		int resultarea = this.height*this.wight;
		return resultarea;
		

	}

}
