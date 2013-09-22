/**
 *HelloWorld1_2.java
 *计算Java内部测试的平均成绩
 */


import java.util.Scanner;

public class HelloWorld1_2 {

	public static void main(String[] args) {
		// 声明变量
		int[] score = new int[3]; // 成绩数组
		int sum = 0; // 成绩总和
		double avg; // 成绩平均值

		// 给数组动态赋值
		Scanner sc = new Scanner(System.in);
		System.out.println("请依次输入学生成绩：");
		for (int index = 0; index < score.length; index++) {
			score[index] = sc.nextInt();
		}

		// 计算平均值
		for (int index = 0; index < score.length; index++) {
			sum = sum + score[index];
		}
		avg = sum / score.length;

		// 显示输出结果
		System.out.println("Java内部测试成绩平均分是： " + avg);
	}
}
