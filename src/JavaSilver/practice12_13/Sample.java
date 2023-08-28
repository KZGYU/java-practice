package JavaSilver.practice12_13;

import java.util.Arrays;
import java.util.List;

public class Sample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(new String[] { "a", "b", "c" });
		list.forEach(x -> {
			System.out.println(x);
		});
	}
}
