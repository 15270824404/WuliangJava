
/**
 * Kehou2.java 上机第3讲：课后作业2：使用if-else结构
 */
public class Kehou2 {

	public static void main(String[] args) {
		/* 产生随机数 */
		int random = (int) (Math.random() * 10);

		//声明变量
		int number =1234;

		/* 分解获得number的百位 */
		int baiwei = number / 100 % 10;

		/* 判断是否是幸运数字 */
		if (baiwei == random) {
			System.out.println(number + "是幸运数字，你真强。");
		} else {
			System.out.println(number + "  ，再试试！");
		}
	}
}
