/*
 * 上机第3讲：课后作业3：
 * 用户有两个整数a、b，
 * 如果a能被b整除或a加b大于100，
 * 则输出a，否则输出b
 * 要求使用三元运算符解决
 */
public class Kehou3 {

	public static void main(String[] args) {
		int a = 10;
		int b = 55;
		int c = (a % b == 0 || (a + b) > 100) ? a : b;
		System.out.println("最后输出的数字是：" + c);

	}
}
