package staticdemo;

class Monkey02 {
	// 静态方法
	static void play() {
		System.out.println("玩皮球！");
	}
}

public class Test02 {
	public static void main(String[] args) {
		// 示例化10个对象
		for (int i = 1; i <= 10; i++) {
			Monkey02 houge = new Monkey02();
			// 通过类名调用静态方法
			Monkey02.play();
		}
	}
}
