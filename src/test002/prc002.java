package test002;



	import java.util.Arrays;
	

	/*No	戻り値	引数	メソッド名	処理内容
	1	なし	1〜5までの数値配列	printOdd	引数の配列の中で奇数のものだけを出力する。※通常のfor文を使用すること
	2	なし	1〜5までの数値配列	printEven	引数の配列の中で奇数のものだけを出力する。※拡張for文を使用すること　
	3	7の倍数値	なし	randomHit	1〜50までの乱数を生成する。7の倍数になるまで繰り返し、7の倍数となったら値を返却する。※whileとbreakを使用すること
	4	なし	{{1,2,3}{4,5,6}}の2次元配列	printTwoDimention	配列の中身を全て出力する。※拡張for文を使用すること　
	5	最大値or最小値	{5,3,10,2,8}の配列, 真偽値	minMax	真偽値がtrueの場合、配列の中の最小値を返却する。falseの場合、最大値を返却する
	6	2倍した配列	1から5までの数値配列	twoTimesCopyArray	引数の数値を2倍した配列を新たに作成し返却する。※元の数値配列は変更されないこと
	*/

	public class prc002 {
		public static void main(String[] args) {

			int[] multiArrys = twoTimesCopyArray();
			System.out.println(Arrays.toString(multiArrys));

		
		}

		public static int[] twoTimesCopyArray() {

			int[] arr = { 1, 2, 3, 4, 5 };
			int[] multiArrys = new int[5];

			for (int i = 0; i < arr.length; i++) {
				multiArrys[i]=arr[i]*2;
			}

			return multiArrys;

		}

	
	
	
}
