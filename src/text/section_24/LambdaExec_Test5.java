package text.section_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExec_Test5 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("a", "e", "d", "b", "c"));

		list.stream() //Streamを生成する
			.sorted() //並び替えの中間処理を行う
			.forEach(System.out::println); //結果取得の終端処理を行う
	}

}
