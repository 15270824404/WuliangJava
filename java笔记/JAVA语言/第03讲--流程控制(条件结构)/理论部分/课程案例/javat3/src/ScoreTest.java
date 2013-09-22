/**
 * 小结2：现场编程1
 */
public class ScoreTest {

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
