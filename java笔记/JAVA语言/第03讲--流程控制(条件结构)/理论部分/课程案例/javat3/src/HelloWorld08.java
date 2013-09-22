/**
 * HelloWorld8.java  使用多重if实现类似switch的结构
 */
public class HelloWorld08 {
	public static void main(String[] args) {
		int mingCi = 3; // 名次
		if (mingCi == 1) {
			System.out.println("出任班长");
		} else if (mingCi == 2) {
			System.out.println("出任大队长");
		} else if (mingCi == 3) {
			System.out.println("出任小组长");
		} else {
			System.out.println("留级");
		}
	}
}
