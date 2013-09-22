package utilpacking.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest3 {

	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		// 指定某年某月某日——月份从0开始
		rightNow.set(2010, 07, 01);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("设置的日期为：" + sdf.format(rightNow.getTime()));
	}
}
