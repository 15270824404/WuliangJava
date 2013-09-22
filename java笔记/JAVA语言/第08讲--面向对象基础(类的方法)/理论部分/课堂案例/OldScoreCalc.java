import java.util.Scanner;

public class OldScoreCalc {

	/**
	 * 计算平均分和总成绩
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/* 接收成绩 */
		Scanner input = new Scanner(System.in);
		System.out.print("请输入Java成绩：");
		int java = input.nextInt();
		System.out.print("请输入HTML成绩：");
		int html = input.nextInt();
		System.out.print("请输入SQL成绩：");
		int sql = input.nextInt();

		/* 计算并显示输出 */
		int total = java + sql + html;
		double avg = total / 3;
		System.out.print("总成绩：" + total);
		System.out.print("\n平均分: " + avg);
	}
}
