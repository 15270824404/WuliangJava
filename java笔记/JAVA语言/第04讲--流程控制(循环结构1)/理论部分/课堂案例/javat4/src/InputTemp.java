import java.util.Scanner;

/*
 * 请输入一个整数，实现一个数字加密器，加密规则是：
 * 加密结果 = （整数*10+5）/2 + 3.14159
 * 加密结果仍为一整数
 */
public class InputTemp {

	/**
	 * 作者：钟慧涛 日期：2010–7–18 功能描述：输入一个整数，实现加密
	 */
	public static void main(String[] args) {
		int num;
		System.out.println("请输入一个整数，便于实现加密");
		// 从控制台接收一个数
		Scanner input = new Scanner(System.in);
		// 用nextInt()方法获取控制台输入的一个整数
		num = input.nextInt();
		// 通过加密公式得出结果
		int result = (int) ((num * 10 + 5) / 2 + 3.14159);
		// 输出数字及加密后的结果
		System.out.println(num + "实现加密后的结果为：" + result);
	}

}
