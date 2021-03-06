/*
 * 第9讲 数组
 * 课后作业5：
 * 数制转换
 * 要求：将十进制数字转换为二进制数字
 * 思路：
 * 将十进制数字除二取余即可
 * 将除二取余得到的数字存储在一个数组中
 * 将得到的第一个余数存储在数组中的第一个元素
 * 第二次得到的余数存储在数组的第二个元素，依次类推
 * 最后反向输出获得的数字即可
 */
public class KeHou05 {

	public static void main(String[] args) {
		int n = 35;// 要转换的整数
		System.out.print(n + "转换成二进制是：");
		int[] m = new int[32];// 整数是32位的，最多需要长度是32的数组
		// 循环变量：拆分到第几次
		int num = 0;
		// 拆分数字
		while (n != 0) {// 只要n不等于0，表明还可以取余数
			m[num] = n % 2;// 取余数
			num++;// 拆分次数加1
			n /= 2;// 取余数后剩下的数
		}
		// 反向输出取到的余数
		for (int i = num - 1; i >= 0; i--) {
			System.out.print(m[i]);
		}
	}
}
