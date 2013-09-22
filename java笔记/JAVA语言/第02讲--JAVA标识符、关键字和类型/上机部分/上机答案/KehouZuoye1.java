/**
 * KehouZuoye1.java
 * 第2讲上机：课后作业1
 */

/* 
 * 有两个变量：number1和number2，
 * 这两个变量的值分别是22和44，
 * 请编程交换这两个变量的值，
 * 并输出这两个变量交换前的值和交换后的值
 */
public class KehouZuoye1 {
	public static void main(String[] args) {
		int number1 = 22;
		int number2 = 44;
		System.out.println("交换前的值：");
		System.out.println("number1是：" + number1);
		System.out.println("number2是：" + number2);
		int temp;// 用一个中间变量来保存中间值
		temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("交换后的值：");
		System.out.println("number1是：" + number1);
		System.out.println("number2是：" + number2);

	}
}
