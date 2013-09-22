/**
 * HelloWorld10.java 演示switch结构的逻辑错误-常见错误1
 */
public class HelloWorld10 {
	public static void main(String[] args) {
		int mingCi = 1;
		switch (mingCi) {
		case 1:
			System.out.println("出任班长");

		case 2:
			System.out.println("出任大队长");

		case 3:
			System.out.println("出任小组长");

		default:
			System.out.println("留级");

		}
	}
}
