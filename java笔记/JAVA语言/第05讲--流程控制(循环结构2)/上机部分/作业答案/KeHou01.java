/*
 * JAVA第5讲：课后作业1：
 * 1～10之间的整数相加，输出累加值大于20的当前数！
 */
public class KeHou01 {
	public static void main(String[] args) {
		int sum = 0; // 和
		for (int i = 1; i <= 10; i++) {
			sum = sum + i; // 累加
			if (sum > 20) {
				System.out.print("当前数是:" + i);
				break;
			}
		}
	}
}