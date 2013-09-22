/*
 * JAVA第5讲：课后作业2：
 * 求1～100之间不能被3整除的数之和（使用for循环结构）
 */
public class KeHou02{

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 3 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("和是：" + sum);
	}
}
