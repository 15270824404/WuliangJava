
/*
 * 过年吃饺子，只给15个，吃完就没有了，用while循环来解决
 * HelloWorld04.java
 */

public class HelloWorld04 {
	public static void main(String[] args) {
		//声明循环变量，并设置初始值
		int i = 1;
		while (i <= 15) {//只要没够15个，就继续吃
			System.out.println("吃第" + i + "个饺子！");//从控制台输出
			i++;//改变循环变量（记数器增加1）
		}

	}
}
