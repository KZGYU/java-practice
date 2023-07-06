package homework;

import java.util.InputMismatchException;

//		1. 「数値を入力してください。　」とコンソールに表示する
//		2. 数値を入力させる　（　new java.util.Scanner(System.in).nextInt() を利用する）
//		3. 数値が1〜10以外の場合はコンソールに「1〜10の間の数を入力してください。」を表示し、1に戻る。
//		4.数値が1〜10の間の場合に、以下の処理を実施する。
//		5. 入力した数値の数だけ繰り返し処理を行い、階乗結果を変数に代入する
//		　　（例：5を入力　→　5　 * 4 * 3 * 2 * 1 の結果）
//		6.　結果の変数をコンソールに表示する。

public class hw02 {
	public static void main(String[] args) {

		int num = getNumber();
		int ans = calc(num, 1);
		System.out.println("階乗結果は、" + ans + "です。");

	}

	public static int calc(int num, int calcAns) {
		for (int i = 1; i < num; i++) {
			calcAns = calcAns * (i + 1);
		}
		return calcAns;
	}

	public static int getNumber() {
		int suchi=0;
		while (true) {
			try {
				System.out.println("数値を入力してください");
				@SuppressWarnings("resource")
				int numb = new java.util.Scanner(System.in).nextInt();
				if (numb >= 1 && numb <= 10) {
					suchi = numb;
					break;
				}
			} catch (InputMismatchException e) {

				System.out.println("1〜10の間の数を入力してください。");

			}

		}
		return suchi;
	}

}
