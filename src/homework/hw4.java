package homework;

/**
 *  Squareクラスを作成する

			1. コンストラクタ

				・引数：高さと幅を受け取る。（int型）

		 	2. クラスメソッド：info

				・引数：なし

				・戻り値：なし

				・処理内容：「このクラスは、面積を求めるクラスです。」を出力する

			3. インスタンスメソッド：area

				・引数：なし

				・戻り値：int

				・処理内容：コンストラクタ引数で設定した高さと幅から、四角形の面積を返却する。

		 ※mainメソッドで、上記で作成したクラスを複数インスタンス化し、各種メソッドを実行する。
 */

public class hw4 {
	public static void main(String[] args) {
		Square a = new Square(10, 20);//インスタンス生成
		Square b = new Square(30, 30);//インスタンス生成
		Square.info();//クラスメソッドを呼び出し
		System.out.println("面積の結果：" + a.area() + "cm^2です。");
		System.out.println("面積の結果：" + b.area() + "cm^2です。");

	}

}
