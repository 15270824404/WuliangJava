package staticdemo;

public class StaticBlock {
	static {
		System.out.println("我是静态代码块");
	}

	//构造方法
	StaticBlock() {

	}

	// 测试
	public static void main(String[] args) {
		StaticBlock b = new StaticBlock();
	}
}
