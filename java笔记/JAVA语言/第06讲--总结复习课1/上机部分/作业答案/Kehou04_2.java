import java.util.Scanner;

/*
 * 从控制台输入一个自然数，判断是不是质数
 * 思路2：
 * 1、其实只需要判断n是否可以被2到n的二次方根之间的数字即可
 * 2、使用Math.sqrt()方法即可，此方法用于算出一个数的二次方根。
 */
public class Kehou04_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 从控制台接收输入的自然数
		System.out.print("请输入一个自然数后回车：");
		int number = input.nextInt();
		// 声明变量用于保存要输出的信息
		String message = "这是一个质数！";
		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				message = "这不是一个质数！";
				break;//一旦发现不是质数，就不用再判断下去了。直接退出循环。
			}
		}
		// 输出信息
		System.out.println(message);
	}
}
