import java.util.*;
/*
 * 第4讲，上机作业3
 * 连续录入学生姓名，输入“q”则系统退出
 */
public class Zuoye3 {

	public static void main(String[] args) {
		String name; // 姓名
		Scanner input = new Scanner(System.in);

		do {
			System.out.print("请输入学生姓名：");
			name = input.next(); // 从控制台接收输入的姓名
		} while (!name.equals("q"));

		System.out.println("程序结束");
	}
}
