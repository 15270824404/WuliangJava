package staticdemo;

class Monkey {
	int age = 10; // ʵ������age
	static int peach = 10;

	static void play() {
		// ����ʵ�������������ܶԷǾ�̬�ֶ� age ���о�̬����
		System.out.println("ʵ������age=" + age);
		// ���ʾ�̬����
		System.out.println("ʵ������peach=" + peach);
	}
}
