/*
 * 上机作业2
 * 编程计算8349各位数字之和
 */
public class Zuoye2 {
	public static void main(String[] args) {
		int number = 8349; 					// 待分解的数字
		int gewei = number % 10; 			// 分解获得个位数
		int shiwei = number / 10 % 10; 		// 分解获得十位数
		int baiwei = number / 100 % 10; 	// 分解获得百位数
		int qianwei = number / 1000; 		// 分解获得千位数
		int sum = gewei + shiwei + baiwei + qianwei; 	// 求和
		System.out.println(number + "各位之和：" + sum);// 输出结果
	}
}
