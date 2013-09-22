/*
 * 打印图形：在控制台中打印图形
 * 思路2：
 * 1、外部循环要循环次打印5行
 * 2、内部每行打印的总字符数量是4+行号
 * 3、其中前5-行号个字符是空格，后续的字符是星号
 * 4、所有字符打印完成后换行
 */
public class Kehou03_2 {
	public static void main(String[] args) {
		// 外层循环控制行
		for (int row = 1; row <= 5; row++) {
			// 根据 col < 5 - row 进行判断，为真则打印空格，否则打印星号
			for (int col = 0; col < 4 + row; col++) {
				System.out.print(col < 5 - row ? ' ' : '*');
			}
			// 换行
			System.out.println();
		}
	}
}
