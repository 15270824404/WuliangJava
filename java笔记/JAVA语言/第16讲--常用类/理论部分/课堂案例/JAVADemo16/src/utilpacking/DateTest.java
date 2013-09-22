package utilpacking;

/*
 * Date类
 * Java在Date类中封装了有关日期和时间的信息
 */
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date date = new Date();// 实例化date对象。获取系统当前时间
		System.out.println("当前时间是：" + date);
	}
}
