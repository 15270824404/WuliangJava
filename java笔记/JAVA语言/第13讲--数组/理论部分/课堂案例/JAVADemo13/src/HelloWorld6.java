/**
 *HelloWorld6.java  升序排列5位学员的Java成绩
 */


import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld6 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] score = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("请输入5位学员的成绩：");
		for (int i = 0; i < 5; i++) {
			score[i] = input.nextInt(); // 依次录入5位学员的成绩
		}

		Arrays.sort(score); // 对数组进行升序排列
		System.out.println("学员成绩按升序排列");
		for (int index = 0; index < score.length; index++) {
			System.out.println(score[index]); // 顺序输出目前数组中的元素
		}
	}
}
