/**
 * Demo012.java
 * 演示continue：求1～100之间个位数不是2、3、4、7，并且不能被3整除的整数之和。
 */
public class Demo012 {

	public static void main(String[] args) {
		int sum = 0; // 定义变量进行保存累加值
		for (int i = 1; i <= 100; i++) {
			// 判断i是否能被3整除
			if (i % 10 == 2 || i % 10 == 3 || i % 10 == 4 || i % 10 == 7
					|| i % 3 == 0) {
				continue;
			}
			sum = sum + i; // 进行累加
		}
		System.out.println("1～100之间个位数不是2、3、4、7，" + "并且不能被3整除的整数和是：" + sum);
	}
}
