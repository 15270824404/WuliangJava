package utilpacking.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest4 {

	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("今天是： " + sdf.format(rightNow.getTime()));
		System.out.println("星期" + rightNow.get(Calendar.DAY_OF_WEEK));
	}
}
