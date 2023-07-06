package homework;
/*【足し算プログラムの作成】

・「最初の数を入力してください」と表示する
・最初の数値をキーボード入力させる
・「次の数を入力してください」と表示する
・２番めの数値をキーボード入力させる
・「結果は○○です。」と表示する。※○○は足し算した結果が入る

補足）キーボードからの数値入力は以下の命令文を使用してください。
new java.util.Scanner(System.in).nextInt();
*/

public class hw01 {
	public static void main(String[] args) {
		System.out.println("最初の数を入力してください");
		@SuppressWarnings("resource")
		int a = new java.util.Scanner(System.in).nextInt();
		System.out.println("次の数を入力してください");
		@SuppressWarnings("resource")
		int b = new java.util.Scanner(System.in).nextInt();
		System.out.println("結果は" + (a + b) + "です。");

	}

}
