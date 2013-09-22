/*
 * 第4讲，上机作业1
 * 2006年培养学员8万人，
 * 每年增长25%，请问按此增长速度，
 * 到哪一年培训学员人数将达到20万人？
 */
public class Zuoye1 {
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
