package shangji.zuoye3;

class Monkey {
	// ������̬����
	static int count = 0;
}

public class Test {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			Monkey m = new Monkey();
			Monkey.count = Monkey.count + 1;
		}
		// ͨ���������ʾ�̬����
		System.out.println(Monkey.count);
	}
}
