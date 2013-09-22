

/*
 *  第9讲：数组
 *  上机作业1-1：
 *  有一个数列：8，4，2，1，23，344，12
 *  1）循环输出数列的值
 *  2）求数列中所有数值的和
 */
public class ZuoYe1_1 {

	public static void main(String[] args) {
		// 声明数组用于保存数列
		int[] numbers = { 8, 4, 2, 1, 23, 344, 12 };
		// 声明变量保存数值的和
		int sum = 0;
		// 循环输出数列的值并求数列中所有数值的和
		System.out.print("数列中的数值有：");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "  ");
			sum = sum + numbers[i];
		}
		// 输出数列中所有数值的和
		System.out.println("\n数列中所有数值的和是：" + sum);
	}

}
