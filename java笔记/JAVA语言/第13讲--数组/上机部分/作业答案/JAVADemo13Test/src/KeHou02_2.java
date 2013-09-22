/*
 * 第9讲 数组
 * 课后作业2：方案2
 * 歌手打分：
 * 在歌唱比赛中，共有10位评委进行打分，在计算得分时，
 * 去掉一个最高分，去掉一个最低分，
 * 然后将剩余8位评委的分数进行平均，以得到此选手的最终得分。
 * 已经10位评委给出的分数分别是：90、78、90、96、67、86、78、92、79、85
 * 请编写JAVA程序用于计算此选手的最终得分
 * 思路：
 * 求出数组元素的最大值、最小值及所有元素的和
 * 使用所有元素的和减去最大值 和最小 值
 * 将最后得到的值除以 8，即可获得最终得分
 */
public class KeHou02_2 {

	/*
	 * 这个方案使用一个循环解决问题，更加简洁
	 */
	public static void main(String[] args) {
		// 声明数组保存分数
		int[] score = { 90, 78, 90, 96, 67, 86, 78, 92, 79, 85 };
		int sum = 0;// 存储值
		int max = score[0];// 存储最大值
		int min = score[0];// 存储最小值
		for (int i = 0; i < score.length; i++) {
			// 求和
			sum += score[i];
			// 获得最大值
			if (max < score[i]) {
				max = score[i];
			}
			// 获得最小值
			if (min > score[i]) {
				min = score[i];
			}
		}
		// 计算平均分
		double avg = (sum - max - min) / 8.0;
		System.out.println("去掉一个最高分：" + max);
		System.out.println("去掉一个最低分：" + min);
		System.out.println("最后得分：" + avg);
	}
}
