/**
 * 小结1：现场编程
 */
public class XiaoJie1 {
	public static void main(String[] args) {
		int year = 2006; // 年份
		int students = 80000; // 学生数
		while (students < 200000) {
			students = (int) (students * (1 + 0.25));
			year++;
			System.out.println(year + "年，培训 " + students + "人");
		}
		System.out.println(year + "年，年培训人到达20万人");
	}
}
