package homework05;

public class Operation {
	public static void main(String[] args) {
		Human human = new Human("鈴木一郎",44);
		System.out.println(human);
		
//		human.setName("田中角栄");  Nameを隠蔽(Private)なので、コンパイルが表示
		human.setAge(60);
		
		System.out.println(human);
		
	}

}
