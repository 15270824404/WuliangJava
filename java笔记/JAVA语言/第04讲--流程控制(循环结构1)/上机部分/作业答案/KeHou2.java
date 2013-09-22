import java.util.*;

/**
 * KeHou2.java 上机第4讲：课后作业2：
 */
public class KeHou2 {
	public static void main(String[] args) {
		/* 产生随机数 */
		int random = (int) (Math.random() * 10);
		String answer;
		do {
			/* 从键盘获取一个4位整数 */
			System.out.print("请输入4位整数： ");
			Scanner input = new Scanner(System.in);
			int custNo = input.nextInt();

			/* 分解获得百位 */
			int baiwei = custNo / 100 % 10;

			/* 判断是否是幸运数字 */
			if (baiwei == random) {
				System.out.println(custNo + "  是数字，你真强。");
			} else {
				System.out.println(custNo + "  谢谢！");
			}
			/* 提示是否继续 */
			System.out.print("\n是否继续（y/n）: ");
			answer = input.next();
		} while (answer.equals("y"));
		System.out.println("\n程序结束！");
	}
}
