package shangji.zuoye2;

/*
 * 编写一个枚举（Color），用于表示三种颜色：Red，Green，Blue;
 * 在枚举中编写一个方法用于随机获取其中任意一种颜色：
 * 通过取出当前系统时间（毫秒数），来获取一个随机值
 * 编写测试类用于取出颜色
 */
public enum Color {
	// 枚举值必须定义在最前面
	Red, Green, Blue;
	// 定义一个变量表示枚举值的数目
	public static int number = Color.values().length;

	/*
	 * 随机返回一个枚举值
	 */
	public static Color getRandomColor() {
		// 通过取出当前系统时间（毫秒数），来获取一个随机值
		long random = System.currentTimeMillis() % number;
		switch ((int) random) {
		case 0:
			return Color.Red;
		case 1:
			return Color.Green;
		case 2:
			return Color.Blue;
		default:
			return Color.Red;
		}
	}
}
