/**
 *HelloWorld1.java
 *计算级班Java测试的平均成绩
 */



public class HelloWorld1 {
	public static void main(String[] args) {
		// 声明变量
		int[] score = { 60, 80, 90, 70, 85 }; // 成绩数组
		int sum = 0; // 成绩总和
		double avg; // 成绩平均值

		// 计算平均值
		for (int index = 0; index < score.length; index++) {
			sum = sum + score[index];
		}
		avg = sum / score.length;

		// 显示输出结果
		System.out.println("Java测试成绩平均分是： " + avg);

	}
}
