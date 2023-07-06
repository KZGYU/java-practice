package text.section_24;
/**
 *  関数型インターフェース
 *  19,23行目は、ラムダ式
 *  丸かっこ()で引数を指定し、矢印の右側で値を返す
 *  23行目は、19行目の丸かっこ()と波かっこ{}がないパターン
 *  13行目の@FunctionalInterfaceは、インターフェースが関数型インターフェース(※)かチェック
 *  (※)インターフェースのメソッドが1つか確認し、1つでない場合にエラーにします。この例ではwriteメソッドのみでエラーにならない
 * @author adven
 *
 */
@FunctionalInterface
interface Color {
	String write(String str);
}
public class ComparatorImplTest {
	public static void main(String[] args) {

		Color c1 = (a) -> {return a + "です";};
		System.out.println(c1.write("赤")); // 赤です

		Color c2 = a -> a + "です";
		System.out.println(c2.write("青")); // 青です
	}

}
