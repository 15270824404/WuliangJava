/**
 *HelloWorld5.java  计算Java内部测试五位学生的最高分
 */


import java.util.*;

public class HelloWorld5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 声明变量
		int[] score = new int[5];
		int max;

		// 循环给数组赋值
		System.out.println("请依次录入5位学生的Java成绩:");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			score[i] = sc.nextInt();
		}

		// 计算成绩最大值
		max = score[0];
		for (int index = 1; index < 5; index++) {
			if (score[index] > max) {
				max = score[index];
			}
		}

		// 显示最大值
		System.out.println("本次考试的五位学生的最高分是： " + max);
	}
}
