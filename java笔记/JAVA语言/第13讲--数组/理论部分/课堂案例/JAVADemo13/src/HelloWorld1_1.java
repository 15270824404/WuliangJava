/**
 *HelloWorld1_1.java
 *计算0901班第一次Java内部测试的平均成绩(使用单独赋值)
 */



public class HelloWorld1_1 {

	/**
	 * @param args
	 *            String[]
	 */
	public static void main(String[] args) {
		// 声明变量
		int[] score = new int[5]; // 成绩数组
		int sum = 0; // 成绩总和
		double avg; // 成绩平均值

		// 给数组静态赋值
		score[0] = 60;
		score[1] = 80;
		score[2] = 90;
		score[3] = 70;
		score[4] = 85;

		// 计算平均值
		for (int index = 0; index < score.length; index++) {
			sum = sum + score[index];
		}
		avg = sum / score.length;

		// 显示输出结果
		System.out.println("0901班Java内部测试成绩平均分是： " + avg);
	}
}
