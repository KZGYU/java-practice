package test002;

public class practice5_2 {
	public static void main(String[] args) {
		
		String address = "girjeiojhioxxx.com";
		String text = "今度、飲みに行きませんか";
		emile(address,text);
		
	}
	public static void emile  (String address,String text) {
		System.out.println(address+ "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文："+ text);
		
	}
	public static void emile  (String title,String address,String text) {
		System.out.println(address +"に、以下のメールを送信しました");
		System.out.println("件名："+ title);
		System.out.println("本文："+ text);
		
	}

}
