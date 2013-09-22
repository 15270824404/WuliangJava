/*
 * 用户有两个整数a、b，如果a能被b整除或a加b大于100，则输出a，否则输出b
 */
public class XiaoJie1_2 {

	public static void main(String[] args) {
		int a = 40;
		int b = 70;
		if (a % b == 0 || (a + b) > 100) {
			System.out.println("a的值是：" + a);
		} else {
			System.out.println("b的值是：" + b);
		}

	}

}
