package utilpacking;

//SimpleDateFormat类在java.text 包中
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
	public static void main(String[] args) {
		Date date = new Date();
		// 定义格式
		String formate = "yyyy年MM月dd日HH时mm分ss秒";
		SimpleDateFormat sdf = new SimpleDateFormat(formate);
		String currentDate = sdf.format(date);
		System.out.println("当前时间是：" + currentDate);
	}
}
