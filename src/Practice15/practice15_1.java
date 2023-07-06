package Practice15;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class practice15_1 {
	public static void main(String[] args) {
		

		System.out.println("--現在の年月日--");
		
        Calendar cl = Calendar.getInstance();
        //日付を西暦yyyy年MM月dd日の形で出力する
        SimpleDateFormat sdf = new SimpleDateFormat("西暦yyyy年MM月dd日");
        String str = sdf.format(cl.getTime());
        System.out.println(str);


		//①現在の日時をDate型で取得
		Date now = new Date();
		Calendar c = Calendar.getInstance();


		//②取得した日時情報をCalendarにセット
		c.setTime(now);
		
		//③Calenderから「日」の情報を取得
		int day = c.get(Calendar.DAY_OF_MONTH);

		//➃取得した値に100を足してCalendarの「日」にセット
		day += 100;
		c.set(Calendar.DAY_OF_MONTH, day);

		//⑤Calenderの日付情報をDate型に変換
		Date future = c.getTime();
		
		System.out.println("--現在の年月日から100日後--");

		//⑥指定された形式で表示
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(f.format(future));

		

//        //日付をyyyy/MM/ddの形で出力する
//        SimpleDateFormat sdf1 = new SimpleDateFormat("西暦yyyy年MM月dd日");
//        String str1 = sdf1.format(c.getTime());
//        System.out.println(str1);	
		
		
		//Time API 
		LocalDate now2 = LocalDate.now();
		LocalDate future2 = now2.plusDays(100);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(future2.format(fmt));

	}

}
