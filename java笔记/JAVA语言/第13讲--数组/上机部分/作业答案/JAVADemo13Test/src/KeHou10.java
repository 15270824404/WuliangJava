/*
 * 第9讲 数组
 * 课后作业10：
 * 打印杨辉三角
 */
public class KeHou10 {

	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col <= row; col++) {
				if (col == 0) {// 第一列
					arr[row][col] = 1;
				} else {
					arr[row][col] = arr[row - 1][col - 1] + arr[row - 1][col];
				}
			}
		}
		//输出的值
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print(arr[row][col] + "  ");
			}
			System.out.println();
		}
	}
}
