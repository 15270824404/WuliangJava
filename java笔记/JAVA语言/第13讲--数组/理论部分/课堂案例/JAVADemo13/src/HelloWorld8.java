

/*
 *	二维数组的遍历
 *	以下代码为二维数组的每个元素赋值
 */
public class HelloWorld8 {

	public static void main(String[] args) {
		String[][] x = new String[2][3];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = "第" + i + "行第" + j + "列";
			}
		}
	}
}
