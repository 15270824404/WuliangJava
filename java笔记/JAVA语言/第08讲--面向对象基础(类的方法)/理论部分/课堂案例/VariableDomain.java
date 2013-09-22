/**
 * 演示变量作用域
 */
public class VariableDomain {
	String color = "黄色"; // 颜色

	/* 跑 */
	public void run() {
		System.out.println("正在以0.1米/秒的速度向前奔跑。");
	}

	/* 叫 */
	public String bark() {
		String sound = "吼";
		return sound;
	}

	/* 获得颜色 */
	public String getColor() {
		return color;
	}

	/* 显示狮子特性 */
	public String showLion() {
		return "这是一个" + getColor() + "的玩具狮子!叫声是" + sound;
	}
}
