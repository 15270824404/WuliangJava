/*
 * 实现1－10的数字相加求和，用while循环实现 
 * HelloWorld06.java
 */

public class HelloWorld06 {
	public static void main(String[] args) {
		// 声明循环变量，并设置初始值
		int i = 1;
		// 声明变量用于放这些数的和
		int sum = 0;
		while (i <= 10) {// 只要没够10个，循环就继续
			//累加求和
			sum = sum + i;
			i++;// 改变循环变量（记数器增加1）
		}
		//在循环结束后输出这些数的和
		System.out.println("从1～10的和是：" + sum);
	}
}
