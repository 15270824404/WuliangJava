/*
 * 第9讲 数组
 * 课后作业9：
 * 拉丁方阵
 * 实现任意阶拉丁矩阵的存储和输出
 * 
 * 数字很规则，使用下面思路解决
 * 思路：
 * 声明一个变量n，代表矩阵的阶
 * 声明和初始化一个n×n的数组
 * 根据数据的规律，则对应的数值为（行号+列号+1）
 * 当数值比n大时，就取对n余数即可
 */
public class KeHou09 {

	public static void main(String[] args) {
		int n = 6;
		int[][] arr = new int[n][n];
		int data;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				data = row + col + 1;
				if (data <= n) {
					arr[row][col] = data;
				} else {
					arr[row][col] = data % n;
				}
			}
		}
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + "   ");
			}
			System.out.println();
		}
	}

}
