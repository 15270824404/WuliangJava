/*
 * 第9讲 数组
 * 课后作业1
 * 要求：
 * 1、输出1  1  2  3  5  8  13……这样的数列，输出该数列的前20个数字
 * 
 * 分析：
 * 1、数字的规律是除了数列里的前两个数字外，其它的数字都满足该数字等于前两个数字的和
 * 2、由于题目要求输出前20个数字，所以需要一个长度为20的数组，第一个和第一个数字直接赋值
 * 3、后续的数字通过前两个数字元素得到
 */
public class KeHou01 {
	public static void main(String[] args) {
		int[] num = new int[20];
		num[0] = 1;
		num[1] = 1;
		// 使用循环初始化数组元素
		for (int i = 2; i < num.length; i++) {
			// 从第三个元素开始，每个元素都是前两个元素的和
			num[i] = num[i - 1] + num[i - 2];
		}
		// 循环输出
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
