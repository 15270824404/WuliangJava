/*
 * 第4讲，上机作业2
 * 实现整数反转：
 * 从控制台接收一个整数，然后输出反转后的数
 */
public class Zuoye2 {
	public static void main(String[] args) {
		int num = 12345; // 表示原来的整数
		int digit; // 表示个位的数字
		System.out.print("反转后的整数是：");
		while (num != 0) {
			digit = num % 10;
			System.out.print(digit);
			num = num / 10;
		}
	}
}
