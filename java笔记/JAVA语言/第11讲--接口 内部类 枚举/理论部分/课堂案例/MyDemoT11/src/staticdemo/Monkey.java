package staticdemo;

class Monkey {
	int age = 10; // 实例变量age
	static int peach = 10;

	static void play() {
		// 访问实例变量——不能对非静态字段 age 进行静态引用
		System.out.println("实例变量age=" + age);
		// 访问静态变量
		System.out.println("实例变量peach=" + peach);
	}
}
