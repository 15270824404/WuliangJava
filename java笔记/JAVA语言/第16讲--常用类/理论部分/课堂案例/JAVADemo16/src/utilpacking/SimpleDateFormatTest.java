package utilpacking;

//SimpleDateFormat����java.text ����
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
	public static void main(String[] args) {
		Date date = new Date();
		// �����ʽ
		String formate = "yyyy��MM��dd��HHʱmm��ss��";
		SimpleDateFormat sdf = new SimpleDateFormat(formate);
		String currentDate = sdf.format(date);
		System.out.println("��ǰʱ���ǣ�" + currentDate);
	}
}
