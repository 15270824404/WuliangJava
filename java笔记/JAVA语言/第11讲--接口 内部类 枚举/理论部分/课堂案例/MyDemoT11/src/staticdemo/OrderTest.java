package staticdemo;

class Order {
	int a = 1;
	// ��̬����
	static int b = 1;
	// ��ͨ�����
	{
		System.out.println("ʵ������a=" + a);
		System.out.println("�����ִ�У�");
	}
	// ��̬�����
	static {
		System.out.println("��̬����b=" + b);
		System.out.println("��̬�����ִ�У�");
	}

	// ���췽��
	Order() {
		System.out.println("���췽��ִ��");
	}
}

// ������
public class OrderTest {
	public static void main(String[] args) {
		// ��������
		Order order = new Order();
	}
}
