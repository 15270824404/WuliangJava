/*
 * 打印图形：在控制台中打印图形
 * 思路1：
 * 1、使用两重循环来实现对行和列的控制
 * 2、外部循环要循环次打印5行
 * 3、内部循环用于控制每一行的每一列
 * 4、每行内容分为两部分：空格和星号
 * 5、每行的空格数量是5减去行号
 * 6、每行的星号数量是行号的2倍减1
 * 7、先打印空格，再打印星号
 */
public class Demo006_1 {
	public static void main(String[] args) {
		// 外层循环控制行
		for (int row = 1; row <= 5; row++) {
			// 用于打印空格，每次打印一个空格
			for (int col1 = 0; col1 < 5 - row; col1++) {
				System.out.print(' ');
			}
			// 用于打印星号，每次打印一个星号
			for (int col2 = 0; col2 < 2 * row - 1; col2++) {
				System.out.print('*');
			}
			// 换行
			System.out.println();
		}
	}
}
