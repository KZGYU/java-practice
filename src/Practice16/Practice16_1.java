package Practice16;

//ラッパークラスをArryaListに格納する

import java.util.ArrayList;

public class Practice16_1 {
	public static void main(String[] args) {//Integer型でArryaListを宣言

		ArrayList<Integer> points = new ArrayList<Integer>();//アレイリスト
		//以下は、自動的にIntegerに変換・格納させる
		points.add(10);
		points.add(80);
		points.add(75);

		for (int i : points) {
			System.out.println(i);
		}

	}

}
