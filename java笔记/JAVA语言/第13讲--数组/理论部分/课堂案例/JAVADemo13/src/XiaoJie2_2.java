

import java.util.Scanner;

/*
 *  第12讲：数组
 *  小结2-2：
 *  有一个数列：8，4，2，1，23，344，12
 *  3）猜数游戏：从键盘中任意输入一个数据，判断数列中是否包含此数
 */
public class XiaoJie2_2 {

	public static void main(String[] args) {
		// 声明数组用于保存数列
		int[] numbers = { 8, 4, 2, 1, 23, 344, 12 };
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int temp = input.nextInt();

		// 声明一个boolean类型的变量用于标记输入的整数是否在数组中存在
		// 先假设不存在
		boolean flag = false;
		for (int i = 0; i < numbers.length; i++) {
			// 如果有相同的，表明存在
			if (temp == numbers[i]) {
				flag = true;
				break;// 如果存在，就不用再判断剩下的数值了
			}
		}
		// 对结果进行判断
		String result = flag ? "您输入的整数在数组中存在！" : "您输入的整数在数组中不存在！";
		System.out.println(result);
	}
}
