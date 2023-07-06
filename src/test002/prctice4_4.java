package test002;

public class prctice4_4 {
	public static void main(String[] args) {
		//[1]配列の準備
		int[] numbers = {3,4,9};
		
		//[2]メッセージの表示
		System.out.println("1桁の数字を入力してください");
		
		//[3]キーボードからの数字入力
		@SuppressWarnings("resource")
		int input = new java.util.Scanner(System.in).nextInt();
		
		//[4]配列を回しながら判定
		for (int n : numbers) {
			if (n == input) {
				System.out.println("アタリ！");
			}
		}
	}

}
