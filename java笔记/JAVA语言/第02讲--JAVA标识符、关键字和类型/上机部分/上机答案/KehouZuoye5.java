/**
 * KehouZuoye5.java
 * 第2讲上机：课后作业5
 */
/*
 * 圆的半径是4.5，计算出圆的面积：
 * 计算出来后用整数表示
 * 圆的面积 = 3.14159*4.5*4.5
 */
public class KehouZuoye5 {

	public static void main(String[] args) {
		double r = 4.5;
		double pi = 3.14159;
		int area = (int) (pi * r * r);
		System.out.print("半径为：" + r + "的圆的面积是：" + area);

	}

}
