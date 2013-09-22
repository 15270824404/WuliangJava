/**
 * HelloWorld12.java 演示三元运算符结构
 */
public class HelloWorld12 {
	/*
	 * 判断成绩是否合格
	 */
	public static void main(String[] args) {
		int score = 69;
		String result = score < 60 ? "不及格" : "及格";
		System.out.println("张三的成绩是：" + result);
	}
}