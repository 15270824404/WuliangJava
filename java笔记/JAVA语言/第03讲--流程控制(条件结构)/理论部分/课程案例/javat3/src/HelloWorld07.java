/**
 * HelloWorld7.java  演示用if-else-if案例2的错误写法--出现逻辑错误
 */
public class HelloWorld07 {
	public static void main(String[] args) {
		int money = 52; // 我的存款，单位（万元）
		if (money >= 500) {
			System.out.println("太好了，我可以买凯迪拉克");
		} else if (money >= 100) {
			System.out.println("不错，我可以买辆帕萨特");
		} else if (money >= 10) {
			System.out.println("至少我可以买个奥托");
		} else if (money >= 50) {
			System.out.println("我可以买辆依兰特");
		} else {
			System.out.println("看来，我只能买个捷安特了");
		}
	}
}
