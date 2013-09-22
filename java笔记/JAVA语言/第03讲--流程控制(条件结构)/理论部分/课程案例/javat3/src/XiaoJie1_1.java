/*
 * 小布什买了一筐鸡蛋，如果坏蛋少于5个，他就吃掉，否则他就去退货
 */
public class XiaoJie1_1 {

	public static void main(String[] args) {
		int badegg = 6;
		if (badegg < 5) {
			System.out.println("坏蛋少于5个，吃掉其余的！");
		} else {
			System.out.println("坏蛋大于等于5个，全部退掉！");
		}
	}
}
