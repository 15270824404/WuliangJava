/*
 *  求两个自然数的最大公约数
 *  思路1：
 *  从1开始循环，每次把符合要求（即同时是两个数字的约数）的值存储在一个变量中，
 *  那么这个变量最后的值就是最大的约数
 */
public class Demo001_1 {
	public static void main(String[] args) {
		int n = 6;// 第1个自然数
		int m = 9;// 第2个自然数
		int result = 1;// 用于保存最大约数
		for (int i = 1; i <= n; i++) {
			// 如果当前数能被两个自然数整除，表明这个数是约数
			if ((n % i == 0) && (m % i == 0)) {
				// 将这个数保存下来
				result = i;
			}
		}
		// 循环结束后，result变量中的值就是最大的约数了
		System.out.println("最大的约数是：" + result);
	}
}
