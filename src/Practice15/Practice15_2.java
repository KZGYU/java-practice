package Practice15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//Time API
public class Practice15_2 {
	public static void main(String[] args) {
		
		System.out.println("--現在の年月日--"); 
		LocalDate now = LocalDate.now();
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(now.format(fmt1));
		
		
		System.out.println("--現在の年月日から100日後--");
		LocalDate future = now.plusDays(100);
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(future.format(fmt2));
		
		
	}
	
	


}
