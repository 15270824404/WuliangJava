/**
 * HelloWorld3.java 演示逻辑运算符的使用
 */
public class HelloWorld03 {
	public static void main(String[] args) {
		int score1 = 100; // 懒羊羊的Java成绩
		int score2 = 72; // 懒羊羊的音乐成绩
		if ((score1 > 90 && score2 > 80) || (score1 == 100 && score2 > 70)) {
			System.out.println("村长说：不错，你可以休息三天");
		}
	}
}
