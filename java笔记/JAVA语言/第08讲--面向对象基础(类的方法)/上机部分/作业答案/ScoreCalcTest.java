/*
 * 第8讲，课后作业1的测试类
 */
import java.util.*;

public class ScoreCalcTest {
	public static void main(String[] args) {
		ScoreCalc sc = new ScoreCalc();
		/* 接收成绩 */
		Scanner input = new Scanner(System.in);
		System.out.print("请输入Java成绩：");
		sc.java = input.nextInt();
		System.out.print("请输入HTML成绩：");
		sc.html = input.nextInt();
		System.out.print("请输入SQL成绩：");
		sc.sql = input.nextInt();
		/* 计算并输出成绩 */
		sc.showTotalScore();
		sc.showAvg();
	}
}
