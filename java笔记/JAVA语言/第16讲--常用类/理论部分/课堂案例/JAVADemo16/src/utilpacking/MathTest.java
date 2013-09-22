package utilpacking;

/*
 * 对一个double类型的数值进行四舍五入
 * 求出两个数值中比较大的一个数
 */
public class MathTest {
	public static void main(String[] args) {
		double number1 = 123.456;
		double number2 = Math.round(number1);
		System.out.println(number1 + "四舍五入后的数是：" + number2);
		double max = Math.max(number1, number2);
		System.out.println(number1 + "和" + number2 + "这两个数中比较大的数是：" + max);
	}
}
