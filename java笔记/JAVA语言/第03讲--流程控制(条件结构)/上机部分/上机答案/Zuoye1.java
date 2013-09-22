/**
 * Zuoye1.java if…else…结构 根据成绩高低做出奖惩
 */
public class Zuoye1 {
	public static void main(String[] args) {
		int score1 = 100; // 懒羊羊的Java成绩
		int score2 = 72; // 懒羊羊的音乐成绩
		if ((score1 > 90 && score2 > 80) || (score1 == 100 && score2 > 70)) {
			System.out.println("村长说：不错，你可以休息三天");
		} else {
			System.out.println("村长说：大懒虫，去抓灰太狼吧！");
		}
	}
}
