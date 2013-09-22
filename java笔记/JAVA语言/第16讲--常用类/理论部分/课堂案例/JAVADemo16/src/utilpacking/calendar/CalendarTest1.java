package utilpacking.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest1 {
	public static void main(String[] args) {
		// 获得当前系统时间
		Calendar rightNow = Calendar.getInstance();
		// 定义时间显示格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String today = sdf.format(rightNow.getTime());
		System.out.println("今天是：" + today);
		// 操作时间对象
		rightNow.add(Calendar.DATE, -1);
		String yesterday = sdf.format(rightNow.getTime());
		System.out.println("昨天是：" + yesterday);
	}
}
