package staticdemo;

class StaticVar {
	// ʵ������
	int a = 1;
	// ��̬����
	static int b = 1;
}

public class Test {
	public static void main(String[] args) {
		StaticVar s1 = new StaticVar();
		s1.a++;
		s1.b++;
		System.out.println("ʵ��s1����ʵ������a=" + s1.a);
		System.out.println("ʵ��s1���ʾ�̬����b=" + s1.b);
		StaticVar s2 = new StaticVar();
		s2.a++;
		s2.b++;
		System.out.println("ʵ��s2����ʵ������a=" + s2.a);
		System.out.println("ʵ��s2���ʾ�̬����b=" + s2.b);
	}
}
