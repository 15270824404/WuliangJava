package utilpacking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest3 {
	public static void main(String[] args) throws Exception {
		// �Զ���ʱ���������͵��ַ���
		String brithday = "1991-08-01";
		// ����Ҫת���ɵ�Ŀ���ʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// parse()���������ڽ��ַ�������ת����Date����
		Date d = sdf.parse(brithday);
		System.out.println("ת����Date���͵�ʱ���ǣ�" + d);
	}
}
