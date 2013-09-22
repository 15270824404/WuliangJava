/*
 * 第8讲
 * 作业1
 * 要求：
 * 1、从控制台接收一个小数
 * 2、编写将小数四舍五入成整数的方法
 * 3、不准使用API中现成的方法
 * 思路：
 * 1、用double类型变量 从控制台接收一个小数
 * 2、将接收到的小数乘以10并取出个位（用模运算）
 * 3、对个位的数字进行判断：
 * 如果小于5就对接收的小数进行强制类型转换为int类型
 * 如果大于5就对接收的小数加1后进行强制类型转换为int类型
 */
import java.util.Scanner;

public class Zuoye1 {
	// 用于转换的方法，直接在方法内处理所有任务，不需要返回值
	public void convert() {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个数：");
		// 接收控制台的输入
		double number = input.nextDouble();
		// 取出个位
		int ge = ((int) (number * 10)) % 10;
		// 对个位进行判断————这里使用了三元运算符，也可以使用if...else...结构
		int result = ge < 5 ? (int) number : (int) (number + 1);
		// 输出结果信息
		System.out.println(number + "经过四舍五入后的数是：" + result);
	}

	// 入口方法
	public static void main(String[] args) {
		// 创建对象
		Zuoye1 z = new Zuoye1();
		// 调用对象的方法
		z.convert();
	}
}
