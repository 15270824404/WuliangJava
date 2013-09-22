/*
 * 强制类型转换
 */
public class HelloWorld7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int before = 20; // apple笔记本市场份额

		double rise = 9.8; // 增长的份额

		// int now = before + rise; //现在的份额——错误用法
		int now = before + (int) rise; // 强制类型转换

	}

}
