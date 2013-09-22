/**
 * HelloWorld1.java 演示boolean类型变量的使用
 */

public class HelloWorld01 {
	public static void main(String[] args) {
		int liSi = 80; // 学员李四成绩
		int zhangSan = 70;// 学员张三成绩
		boolean isBig; // 声明一个boolean类型的变量

		isBig = zhangSan > liSi; // 将比较结果保存在boolean变量中
		System.out.println("张三成绩比李四高吗 ？ " + isBig); // 输出比较结果
	}
}
