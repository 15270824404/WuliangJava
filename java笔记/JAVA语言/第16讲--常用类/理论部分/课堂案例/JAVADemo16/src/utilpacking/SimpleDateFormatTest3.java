package utilpacking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest3 {
	public static void main(String[] args) throws Exception {
		// 自定义时间日期类型的字符串
		String brithday = "1991-08-01";
		// 定义要转换成的目标格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// parse()方法，用于将字符串类型转换成Date类型
		Date d = sdf.parse(brithday);
		System.out.println("转换成Date类型的时间是：" + d);
	}
}
