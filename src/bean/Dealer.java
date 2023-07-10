package bean;

/**
 * 
・ディーラークラス(Humanクラスを継承してる)
・Singletonパターンにしている(複数存在しないようにするため)
・ただのグローバル変数にならないように、Singletonパターン作成時の注意する箇所
　　-> 注1)状態を持たないこと
　　-> 注2)ポリモーフィズムが絡むこと
 */

import Constant.Constant;
import common.CommonFunc;

public class Dealer extends Human {
	private static final Dealer instance = new Dealer();

	/**
	 * 唯一のインスタンスを返す
	 * @return このクラスの唯一のインスタンス
	 */
	public static Dealer getInstance() {
		return instance;
	}

	/**
	 * 外部からインスタンス化できないよう、コンストラクタをprivateで宣言する
	 */
	private Dealer() {

	}

	/**
	 * 手札のカード1枚見せる
	 */
	@Override
	public void open() {
		StringBuilder sb = new StringBuilder();

	}

	/**
	 * 現在表示している点数を取得する
	 * @return 手札の合計点
	 */
	private int getOpenOneScore() {
		return hand.get(0).getNumber().getNum();
	}

	/**
	 * 17を超えるまで引く
	 * @param deck デッキ
	 */
	public void drawOver17(Deck deck) {
		int score = CommonFunc.getScore(true, super.hand);
		while (score < 17) {

		}
	}

	/**
	 * 発言相手によって、メッセージを変える
	 * @param playerName 発言する人名
	 * @param message メッセージ
	 * @return 変換後のメッセージ
	 */
	private String changeMsg(String playerName, String message) {
		if (playerName.equals(Constant.PLAYER)) {
			return message;
		} else {
			return message.replace(Constant.YOU_ARE, playerName + " is");
		}
	}

	/**
	 * 勝ち(nomal)をたたえる
	 * @param playerName 発言している人の名前
	 */
	public void sayYouWin(String playerName) {

	}

	/**
	 * 勝ち(BJ)をたたえる
	 * @param playerName 発言している人の名前
	 */
	public void sayYouWinBj(String playerName) {

	}

	/**
	 * 負けを煽る
	 * @param playerName 発言している人の名前
	 */
	public void sayYouLose(String playerName) {

	}

	/**
	 * 引き分けだと伝える
	 * @param playerName 発言している人の名前
	 */
	public void sayYouDraw(String playerName) {

	}
}
