package utilpacking.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest4 {

	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("�����ǣ� " + sdf.format(rightNow.getTime()));
		System.out.println("����" + rightNow.get(Calendar.DAY_OF_WEEK));
	}
}
