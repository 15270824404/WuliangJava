package staticdemo;

class StaticVar {
	// 实例变量
	int a = 1;
	// 静态变量
	static int b = 1;
}

public class Test {
	public static void main(String[] args) {
		StaticVar s1 = new StaticVar();
		s1.a++;
		s1.b++;
		System.out.println("实例s1访问实例变量a=" + s1.a);
		System.out.println("实例s1访问静态变量b=" + s1.b);
		StaticVar s2 = new StaticVar();
		s2.a++;
		s2.b++;
		System.out.println("实例s2访问实例变量a=" + s2.a);
		System.out.println("实例s2访问静态变量b=" + s2.b);
	}
}
