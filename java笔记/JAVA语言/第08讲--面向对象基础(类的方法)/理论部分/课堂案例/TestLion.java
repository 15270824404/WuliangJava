/*
 * TestLion.java  测试AutoLion的类
 */
public class TestLion {
	public static void main(String[] args) {
		AutoLion lion = new AutoLion(); // 创建AutoLion对象
		System.out.println(lion.showLion());// 调用方法显示类信息
		lion.run(); // 调用跑方法
		System.out.println(lion.bark()); // 调用叫方法
	}
}
