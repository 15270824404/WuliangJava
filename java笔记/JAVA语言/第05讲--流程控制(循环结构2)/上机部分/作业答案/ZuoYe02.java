import java.util.Scanner;

/*
 * JAVA第5讲：上机作业2：
 * ZuoYe02.java 演示break,录入错误退出
 */
public class ZuoYe02{
	public static void main(String[] args) {
		int score; // 每门课的成绩
		int sum = 0; // 成绩之和
		int avg; // 平均分
		boolean wrong = true;
		Scanner input = new Scanner(System.in);
		System.out.print("输入学生姓名: ");
		String name = input.next(); // 输入姓名

		for (int i = 0; i < 5; i++) { // 循环5次录入5门课成绩
			System.out.print("请输入5门功课中第" + (i + 1) + "门课的成绩： ");
			score = input.nextInt();
			if (score < 0) {
				wrong = false;
				break;
			}
			sum = sum + score;
		}

		if (wrong) {
			avg = sum / 5; // 计算平均分
			System.out.println(name + "的平均分是：" + avg);
		} else {
			System.out.println("抱歉，分数录入错误，请重新进行录入！");
		}
	}
}
