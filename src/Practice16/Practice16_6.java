package Practice16;
//マップに格納された情報を１つずつ取り出す
import java.util.HashMap;
import java.util.Map;

public class Practice16_6 {
	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		for (String Key : prefs.keySet()) {
			int value = prefs.get(Key);
			System.out.println(Key + "人口は、" + value);
		}

	}

}
