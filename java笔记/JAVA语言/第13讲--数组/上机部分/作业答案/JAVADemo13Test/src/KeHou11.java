/*
 * 第9讲 数组
 * 课后作业11：
 * 螺旋数组
 * 要求：存储和输出n×m的螺旋数组，其中n和m为大于0的整数
 * 思路：
 * 声明一个变量来代表需要为数组元素赋的值，对于其中的数字来说，
 * 每个数字都有移动方向，这个方向指向下一个元素，
 * 根据该方向改变数组的下标，如果到达边界或指向的元素已经赋值，则改变方向
 * 移动规则：
 * 1、开始时，向右移动
 * 2、移动到右边不能再移动时（这个元素的右边元素有值或是右边没元素了），要向下移动
 * 3、移动到下边不能再移动时（这个元素的下边元素有值或是下边没元素了），要向左移动
 * 4、移动到左边不能再移动时（这个元素的左边元素有值或是左边没元素了），要向上移动
 * 5、移动到上边不能再移动时（这个元素的上边元素有值或是上边没元素了），要向右移动
 * 6、从第一步开始重复
 */
public class KeHou11 {

	public static void main(String[] args) {
		int n = 4;// 螺旋数组行数——第一维数组大小
		int m = 5;// 螺旋数组列数——第二维数组大小
		// 声明这个二维数组
		int[][] data = new int[n][m];
		int dire;// 当前数字移动方向
		final int UP = 0;// 上
		final int DOWN = 1;// 下
		final int LEFT = 2;// 左
		final int RIGHT = 3;// 右
		dire = RIGHT;// 先设置为向右移动：因为一开始是向右移动的
		int value = 1;// 数组元素的值
		int row = 0;// 第一维下标
		int col = 0;// 第二维下标
		data[0][0] = value;// 初始华第一个元素
		// 用循环为二维数组元素赋值
		while (value < n * m) {
			// 对移动的方向进行判断
			switch (dire) {
			case UP:// 向上
				row--;// 向上移动行数减1
				if (row < 0) {// 小于0则表明已经移出去了，上面没元素了
					row++;// 移回来
					dire = RIGHT;// 不能向上了，要向右移动
					continue;// 跳过本次循环，重新再来
				} else if (data[row][col] != 0) {// 如果已经有值了，也不能移动了
					row++;// 移回来
					dire = RIGHT;// 不能向上了，上面元素有值，要向右移动
					continue;// 跳过本次循环，重新再来
				}
				break;
			case DOWN:// 向下
				row++;// 向下移动行数加1
				if (row >= n) {// 大于等于n表明已经移出去了，下面没元素了
					row--;// 移回来
					dire = LEFT;// 不能向下了，要向左移动
					continue;// 跳过本次循环，重新再来
				} else if (data[row][col] != 0) {// 如果已经有值了，也不能移动了
					row--;// 移回来
					dire = LEFT;// 不能向下移了，下面元素有值，要向左移动
					continue;// 跳过本次循环，重新再来
				}
				break;
			case LEFT:// 向左
				col--;// 向左移动列数减1
				if (col < 0) {// 小于0则表明已经移出去了，左面没元素了
					col++;// 移回来
					dire = UP;// 不能向左了，要向上移动
					continue;// 跳过本次循环，重新再来
				} else if (data[row][col] != 0) {// 如果已经有值了，也不能移动了
					col++;// 移回来
					dire = UP;// 不能向左了，左面元素有值，要向上移动
					continue;// 跳过本次循环，重新再来
				}
				break;
			case RIGHT:
				col++;// 向右移动列数加1
				if (col >= m) {// 大于等于m表明已经移出去了，右面没元素了
					col--;// 移回来
					dire = DOWN;// 不能向右了，要向下移动
					continue;// 跳过本次循环，重新再来
				} else if (data[row][col] != 0) {// 如果已经有值了，也不能移动了
					col--;// 移回来
					dire = DOWN;// 不能向右移了，右面元素有值，要向下移动
					continue;// 跳过本次循环，重新再来
				}
				break;
			}
			// 离开switch
			value++;
			// 赋值
			data[row][col] = value;
		}
		// 结束while循环，输出数组中的元素
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				// 小于10时，在前面补个空格，以实现对齐
				if (data[i][j] < 10) {
					System.out.print(' ');
				}
				// 输出当前元素
				System.out.print(data[i][j]);
				// 每个元素用空格隔开
				System.out.print(' ');
			}
			// 换行
			System.out.println();
		}
	}
}
