package homework;

import java.util.Arrays;
import java.util.Random;

/*No	戻り値	引数	メソッド名	処理内容
1	なし	1〜5までの数値配列	printOdd	引数の配列の中で奇数のものだけを出力する。※通常のfor文を使用すること
2	なし	1〜5までの数値配列	printEven	引数の配列の中で奇数のものだけを出力する。※拡張for文を使用すること　
3	7の倍数値	なし	randomHit	1〜50までの乱数を生成する。7の倍数になるまで繰り返し、7の倍数となったら値を返却する。※whileとbreakを使用すること
4	なし	{{1,2,3}{4,5,6}}の2次元配列	printTwoDimention	配列の中身を全て出力する。※拡張for文を使用すること　
5	最大値or最小値	{5,3,10,2,8}の配列, 真偽値	minMax	真偽値がtrueの場合、配列の中の最小値を返却する。falseの場合、最大値を返却する
6	2倍した配列	1から5までの数値配列	twoTimesCopyArray	引数の数値を2倍した配列を新たに作成し返却する。※元の数値配列は変更されないこと
*/

public class hw03 {
	public static void main(String[] args) {

		//1 なし	1〜5までの数値配列	printOdd	引数の配列の中で奇数のものだけを出力する。※通常のfor文を使用すること
		printOdd();
		//---------------------------------------------------------------------------------------------------------------

		//2	なし	1〜5までの数値配列	printEven	引数の配列の中で奇数のものだけを出力する。※拡張for文を使用すること
		printEven();
		//---------------------------------------------------------------------------------------------------------------		

		//3  7の倍数値	なし	randomHit	1〜50までの乱数を生成する。7の倍数になるまで繰り返し、7の倍数となったら値を返却する。※whileとbreakを使用すること
		int rhitOut = randomHit();
		System.out.println(rhitOut);
		//-----------------------------------------------------------------------------------------------------------------------------------------------

		//4	なし	{{1,2,3}{4,5,6}}の2次元配列	printTwoDimention	配列の中身を全て出力する。※拡張for文を使用すること
		printTwoDimention();
		//--------------------------------------------------------------------------------------------------------------

		//5	最大値or最小値	{5,3,10,2,8}の配列, 真偽値	minMax	真偽値がtrueの場合、配列の中の最小値を返却する。falseの場合、最大値を返却する
		int[] list = { 5, 3, 10, 2, 8 };
		int minValue = minMax(list, true);
		int maxValue = minMax(list, false);
		System.out.println(minValue);
		System.out.println(maxValue);
		//---------------------------------------------------------------------------------------------------------------------------------------

		//6	2倍した配列	1から5までの数値配列	twoTimesCopyArray	引数の数値を2倍した配列を新たに作成し返却する。※元の数値配列は変更されないこと
		int[] arr = { 1, 2, 3, 4, 5 };
		// 引数に配列を渡し、戻り値に2倍された配列を返す。
		int[] multiArrys = twoTimesCopyArray(arr);
		System.out.println(Arrays.toString(arr)); // 元の配列は変更されない
		System.out.println(Arrays.toString(multiArrys));
		//-----------------------------------------------------------------------------------------------------------------------------------------

	}

	//6	2倍した配列	1から5までの数値配列	twoTimesCopyArray	引数の数値を2倍した配列を新たに作成し返却する。※元の数値配列は変更されないこと
	public static int[] twoTimesCopyArray(int[] arr) {

		int[] multiArrys = new int[5];

		for (int i = 0; i < arr.length; i++) {
			multiArrys[i] = arr[i] * 2;
		}

		return multiArrys;

	}

	//5	最大値or最小値	{5,3,10,2,8}の配列, 真偽値	minMax	真偽値がtrueの場合、配列の中の最小値を返却する。falseの場合、最大値を返却する
	public static int minMax(int[] list, boolean judge) {

		int minmaxValue = list[0];

		//最大値取得
		if (judge == true) {
			for (int i = 1; i < list.length; i++) {// 要素0番目のは代入済みのため1番目から開始する
				//Numberに代入されている値と配列の要素を比較して、配列の要素のほうが小さい場合値を上書きする.
				if (minmaxValue > list[i]) {
					minmaxValue = list[i];
				}

			}

			//最小値取得	
		} else if (judge == false) {
			for (int i = 1; i < list.length; i++) {// 要素0番目のは代入済みのため1番目から開始する
				//Numberに代入されている値と配列の要素を比較して、配列の要素のほうが大きい場合値を上書きする.
				if (minmaxValue < list[i]) {
					minmaxValue = list[i];
				}
			}

		}

		return minmaxValue;

	}

	//4	なし	{{1,2,3}{4,5,6}}の2次元配列	printTwoDimention	配列の中身を全て出力する。※拡張for文を使用すること
	public static void printTwoDimention() {
		int[][] twoarrays = { { 1, 2, 3 }, { 4, 5, 6 } };//二次元配列
		for (int[] Anember : twoarrays) {//二個の配列拡張for文でループ
			for (int Bnember : Anember) {//各配列の中の数値を拡張for文でループ
				System.out.println(Bnember);//各配列の中の数値をコンソールで表示
			}
		}
	}

	//3  7の倍数値	なし	randomHit	1〜50までの乱数を生成する。7の倍数になるまで繰り返し、7の倍数となったら値を返却する。※whileとbreakを使用すること
	public static int randomHit() {
		Random random = new Random();
		int rhitOut = 0;
		while (true) {
			rhitOut = random.nextInt(51) + 1;
			if (rhitOut % 7 == 0) {
				break;
			}
		}
		return rhitOut;
	}

	//2	なし	1〜5までの数値配列	printEven	引数の配列の中で奇数のものだけを出力する。※拡張for文を使用すること
	public static void printEven() {
		int[] scores = { 1, 2, 3, 4, 5 };
		for (int number : scores) {
			if (number % 2 == 1) { //奇数判定
				System.out.println(number);
			}
		}
	}

	//1 なし	1〜5までの数値配列	printOdd	引数の配列の中で奇数のものだけを出力する。※通常のfor文を使用すること
	public static void printOdd() {
		int[] scores = { 1, 2, 3, 4, 5 };
		for (int i = 0; i <= scores.length; i++) {
			if (i % 2 == 1) { //奇数判定
				System.out.println(i);
			}
		}
	}
}
