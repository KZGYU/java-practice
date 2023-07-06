package Practice11;

//11章　インターフェース

/**
 * インタフェースとはクラス仕様としての型定義をするもの
 *インターフェイスと実装クラスの「実装」の関係はCAN DOの関係
　レジ CAN bill クレジットカード＝レジはクレジットカード会計が出来る。のような関係
 *
 */
public class Interface {
	public static void main(String[] args) {
		
		Cashier cash = new Cash();
		Cashier credit =new CreditCard();
		
		System.out.println("****現金対応****");
		cash.bill();
		
		System.out.println("****クレジットカード対応****");
		credit.bill();
	}
	

}
