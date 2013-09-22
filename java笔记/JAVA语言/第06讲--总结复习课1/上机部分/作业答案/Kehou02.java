/*
 * 在控制台打印数字上的99乘法表
 */
public class Kehou02 {
	public static void main(String[] args) {
		//外层循环控制行
		for (int row = 1; row < 10; row++) {
			//内层循环控制列
			for (int col = 1; col <= row; col++) {
				System.out.print(row + "×" + col + "=" + row * col+"\t");
			}
			//每一行打印完成后才换行
			System.out.println();
		}
	}
}
