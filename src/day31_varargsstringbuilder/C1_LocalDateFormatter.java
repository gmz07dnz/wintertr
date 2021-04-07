package day31_varargsstringbuilder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C1_LocalDateFormatter {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); //  2021-03-20T17:11:53.185069200
		
		DateTimeFormatter dtf =DateTimeFormatter.ofPattern("yy/MMMM/dd hh:mm");
		System.out.println(dtf.format(ldt)); // 21/March/20 05:14

		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MMM/ dd");
		System.out.println(dtf2.format(ldt)); // 21/Mar/ 20
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(dtf3.format(ldt));  // 17:23
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf4.format(ldt)); // 05:23
				
	}

}
