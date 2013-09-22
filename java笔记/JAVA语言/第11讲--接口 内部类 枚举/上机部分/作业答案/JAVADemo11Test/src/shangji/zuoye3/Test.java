package shangji.zuoye3;

class Monkey {
	// 声明静态变量
	static int count = 0;
}

public class Test {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			Monkey m = new Monkey();
			Monkey.count = Monkey.count + 1;
		}
		// 通过类名访问静态变量
		System.out.println(Monkey.count);
	}
}
