package utilpacking.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest1 {
	public static void main(String[] args) {
		// ��õ�ǰϵͳʱ��
		Calendar rightNow = Calendar.getInstance();
		// ����ʱ����ʾ��ʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String today = sdf.format(rightNow.getTime());
		System.out.println("�����ǣ�" + today);
		// ����ʱ�����
		rightNow.add(Calendar.DATE, -1);
		String yesterday = sdf.format(rightNow.getTime());
		System.out.println("�����ǣ�" + yesterday);
	}
}
