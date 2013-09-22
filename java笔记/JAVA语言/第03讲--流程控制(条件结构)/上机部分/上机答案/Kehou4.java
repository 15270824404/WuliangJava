/*
 * 上机第3讲：课后作业4：
 * 根据赵本山的考试成绩，显示所获奖励
 * 成绩==100分，爸爸给他买辆车
 * 成绩>=90分，妈妈给他买MP4
 * 90分>成绩>=60分，妈妈给他买本参考书
 * 成绩<60分，什么都不买
 */
public class Kehou4 {

	public static void main(String[] args) {

		int score = 95; // 成绩
		if (score == 100) {
			System.out.println("他爸爸给他买辆车");
		} else if (score >= 90) {
			System.out.println("他妈妈给他买MP4");
		} else if (score < 90 && score >= 60) {
			System.out.println("他妈妈给他买本参考书");
		} else {
			System.out.println("什么都不买");
		}
	}

}
