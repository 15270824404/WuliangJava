/*
 * java.lang.Math类的max()方法能够从两个数字中取出最大值，它有多种实现方式
 * 运行时，Java虚拟机先判断给定参数的类型，然后决定到底执行哪个max()方法
 */
public class Demo002 {
	public static void main(String[] args) {
		Math.max(1, 2);
		Math.max(1.0F, 2.0F);
		Math.max(1.0, 2);
	}
}
