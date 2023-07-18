package JavaSilver;

public class practice5_5 {
	public static void main(String[] args) {
		practice5_5_Item[] item = new practice5_5_Item[3];
		int total = 0;
		for (int i = 0; i < item.length; i++) {
			total += item[i].price;
		}
		System.out.println(total);
	}

}
