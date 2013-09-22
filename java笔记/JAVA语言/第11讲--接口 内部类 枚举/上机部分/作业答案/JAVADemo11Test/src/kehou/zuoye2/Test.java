package kehou.zuoye2;

import java.util.Scanner;

/*
 * 当输入1时，是红灯
 * 当输入2时，是黄灯
 * 当输入3时，是绿灯
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("请输入一个整数：（1：红灯\t2：黄灯\t3：绿灯）");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		Color color = Color.getColor(number);
		System.out.println("灯的颜色是：" + color);
	}
}
