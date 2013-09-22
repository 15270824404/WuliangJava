
/*
 * 打印杨辉三角
 */
public class XiaoJie5 {

	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		// 给二维数组赋值
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col <= row; col++) {
				if (col == 0) {// 第一列
					arr[row][col] = 1;
				} else {
					arr[row][col] = arr[row - 1][col - 1] + arr[row - 1][col];
				}
			}
		}
		// 输出值
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print(arr[row][col] + "  ");
			}
			System.out.println();
		}
	}
}
