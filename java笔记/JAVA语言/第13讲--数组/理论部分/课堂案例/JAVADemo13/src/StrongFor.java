

/*
 *  第12讲：数组
 *  用增强for循环解决问题：
 *    有一个数列：8，4，2，1，23，344，12
 *    要求：循环输出数列的值
 */
public class StrongFor {

	public static void main(String[] args) {
		int list[] = { 8, 4, 2, 1, 23, 344, 12 };
		System.out.println("这个数列的值分别是：");
		//使用增强for循环输出数列的值
		for (int num : list) {
			System.out.print(num + "    ");
		}
	}
}
