import java.util.*;

/**
 * HelloWorld07.java 计算班级平均分
 */
public class HelloWorld07 {
	public static void main(String[] args) {
		String classNo; // 班级号
		int stuNum; // 班级的学生人数
		int score; // 学生分数
		int sum = 0; // 学生分数总和
		int avg; // 学生成绩平均值

		System.out.print("请输入班级号： ");
		Scanner input = new Scanner(System.in);
		classNo = input.next();

		System.out.print("请输入该班级的学员总数：");
		stuNum = input.nextInt();

		int i = 1;
		while (i <= stuNum) {
			System.out.print("请输入学号" + i + "的成绩：");
			score = input.nextInt();
			sum = sum + score;
			i++;
		}
		avg = sum / stuNum;
		System.out.println(classNo + "班学员的平均成绩为： " + avg);
	}
}
