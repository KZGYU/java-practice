package Practice15;

import java.util.Calendar;

public class Practice15_3 {
	public static void main(String[] args) {

		//実行時の日付/時刻情報を持つカレンダーインスタンス作成
		Calendar cal = Calendar.getInstance();

		//Calendarクラスのインスタンスはgetメソッドを使って情報を個別に取り出す
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;//月のGetメソッドは0～11になるので、＋１を足す
		int today = cal.get(Calendar.DATE);

		//インタンスの持つ日付情報を1日に変更
		cal.set(Calendar.DATE, 1);

		//DAY_OF_WEEKでその日の曜日を返す2023/01/01は日曜なので1
		//（日曜:1,月:2,火:3,,,,土:7）
		//カレンダー的な最初のブランクの数　(1日が木なら空白は日、月、火、水、の４個)
		int beforeBlank = cal.get(Calendar.DAY_OF_WEEK) - 1;

		//API「月末日付を取得する」　
		int daysCount = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		//printfで年月の文字列をコンソールで出力
		System.out.printf("%16d/%d%n", year, month);

		//曜日の入った配列を作って拡張forで出力
		String[] weeks = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		for (String s : weeks) {
			System.out.printf("%4s", s);
		}
		//コンソールを改行
		System.out.println();

		//ブランクと日数分ループを回す
		for (int i = 0; i < beforeBlank + daysCount; i++) {
			String str = "";//ブランクは空文字
			//最初のブランク分すぎたら日付
			if (i >= beforeBlank) {
				//カウンター変数iから求める実際の日付
				int date = i + 1 - beforeBlank;
				str = String.valueOf(date);

				//現在の日付に「*」を付ける
				if (date == today) {
					str = "*" + str;
				}

			}
			//４文字分のスペースを使って出力
			System.out.printf("%4s", str);
			//7個出力したら改行
			if ((i + 1) % 7 == 0) {
				System.out.println();
			}
		}

		System.out.println();

	}

}
