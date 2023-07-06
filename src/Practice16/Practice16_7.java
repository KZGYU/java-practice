package Practice16;

import java.util.ArrayList;
import java.util.List;

public class Practice16_7 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("東京都");
		list.add("大阪府");

		for (String s : list) {
			System.out.println(s);
		}

		System.out.println("--  --");
		list.add(1, "神奈川県");

		for (String s : list) {
			System.out.println(s);
		}

		System.out.println("--  --");

		list.remove(0);

		for (String s : list) {
			System.out.println(s);
		}

	}

}
