package staticdemo;

public class StaticMoney {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			Monkey01 m = new Monkey01();
			m.count = m.count + 1;
		}
		// ͨ���������ʾ�̬����
		System.out.println(Monkey01.count);
	}
}

class Monkey01 {
	// ������̬����
	static int count = 0;
}
