package utilpacking.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest3 {

	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		// ָ��ĳ��ĳ��ĳ�ա����·ݴ�0��ʼ
		rightNow.set(2010, 07, 01);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("���õ�����Ϊ��" + sdf.format(rightNow.getTime()));
	}
}
