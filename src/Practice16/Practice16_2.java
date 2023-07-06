package Practice16;

/**
 * イテレーターを使ったArryListの繰り返し
 * イテレータは、集合の要素に順番にアクセスする時に使用するインターフェースです。
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice16_2 {
	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("tanaka");
		names.add("suzuki");
		names.add("yamada");

		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String e = it.next();
			System.out.println(e);

		}

	}

}
