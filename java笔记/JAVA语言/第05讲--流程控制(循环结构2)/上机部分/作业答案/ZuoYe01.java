import java.util.*;

/*
 * JAVA第5讲：上机作业1：
 * ZuoYe01.java 演示for循环，录入5门课成绩，并计算平均值
 */
public class ZuoYe01{
	public static void main(String[] args) {
		int score; // 每门课的成绩
		int sum = 0; // 成绩之和
		int avg; // 平均分
		Scanner input = new Scanner(System.in);
		System.out.print("输入学生姓名: ");
		String name = input.next(); // 输入姓名

		for (int i = 0; i < 5; i++) { // 循环5次录入5门课成绩
			System.out.print("请输入5门功课中第" + (i + 1) + "门课的成绩： ");
			score = input.nextInt();
			sum = sum + score;
		}

		avg = sum / 5; // 计算平均分
		System.out.println(name + "的平均分是：" + avg);
	}
}
