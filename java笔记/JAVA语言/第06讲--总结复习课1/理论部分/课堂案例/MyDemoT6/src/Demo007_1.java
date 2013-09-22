import java.util.Scanner;

/*
 * 从控制台输入一个自然数，判断是不是质数
 * 思路1：
 * 1、如果能证明输入的自然数可以被除了1和其自身以外的其他自然数整除，则表明这个自然数不是质数
 * 2、只需要判断2～n-1之间的数字即可，因为在数学上n不可能被大于n的数字整除
 */
public class Demo007_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 从控制台接收输入的自然数
		System.out.print("请输入一个自然数后回车：");
		int number = input.nextInt();
		// 声明变量用于保存要输出的信息
		String message = "这是一个质数！";
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				message = "这不是一个质数！";
				break;//一旦发现不是质数，就不用再判断下去了。直接退出循环。
			}
		}
		// 输出信息
		System.out.println(message);
	}
}
