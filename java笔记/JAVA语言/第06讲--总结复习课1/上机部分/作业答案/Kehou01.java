/*
 *水仙花数指三位数中，每个数字的立方和等于自身的数字，
 *例如：370：3×3×3+ 7×7×7+ 0×0×0=370，
 *请输出所有水仙花数
 */
public class Kehou01 {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {// 循环所有三位数
			int a = i % 10;// 取出个位数字
			int b = i / 10 % 10;// 取出十位数字
			int c = i / 100;// 取出百位数字
			// 进行判断
			if (a * a * a + b * b * b + c * c * c == i) {
				System.out.println(i);
			}
		}
	}
}
