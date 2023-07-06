package Practice14;
/**
 * staticメソッドを使用するメリットは、インスタンス化しなくても利用できるという点
 * インスタンス化による影響を受けないので、クラス単体で何かを実行したい場合に便利
 *
 */

public class Main {
	public static void main(String[] args) {
		Output.staticMethod();
		
	}

}

class Output{
	public static void staticMethod() {
		System.out.println("staticMethodです");
		
	}

	public void instanceMethod() {
		System.out.println("StaticMethodではない");
		
	}
}