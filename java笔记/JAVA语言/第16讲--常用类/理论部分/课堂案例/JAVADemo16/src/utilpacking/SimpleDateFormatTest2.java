package utilpacking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest2 {
	public static void main(String[] args) {
		Date date = new Date();
		// ��H����ʾ24Сʱ��
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("��ǰʱ���ǣ�" + sdf1.format(date));
		// ��h����ʾ12Сʱ��
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("��ǰʱ���ǣ�" + sdf2.format(date));
	}
}
