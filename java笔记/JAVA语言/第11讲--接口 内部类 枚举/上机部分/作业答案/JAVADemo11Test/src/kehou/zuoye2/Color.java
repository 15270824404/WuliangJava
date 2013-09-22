package kehou.zuoye2;

public enum Color {
	// 枚举值必须定义在最前面
	Red, Green, Yellow;
	/*
	 * 根据输入的值返回一个枚举值
	 * 
	 * 当输入1时，是红灯
	 * 
	 * 当输入2时， 是黄灯 当
	 * 
	 * 输入3时，是绿灯
	 */
	public static Color getColor(int number) {
		switch (number) {
		case 1:
			return Color.Red;
		case 2:
			return Color.Yellow;
		case 3:
			return Color.Green;
		default:
			return Color.Red;
		}
	}
}
