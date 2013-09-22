package enumdemo;
/*
 * 声明一个枚举
 */
enum Color {
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
		case 0:			return Color.Red;
		case 1:			return Color.Green;
		case 2:			return Color.Blue;
		default:		return Color.Red;
		}
	}
}
public class TestEnum {
	public static void main(String[] args) {
		System.out.println("枚举中的颜色值有：");
		for (Color c : Color.values()) {
			System.out.println(c);
		}
	}
}
