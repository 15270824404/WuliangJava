package innerclass;

/*
 * �ڲ���ʹ��ʾ������
 */
class OutClass {

	// �ⲿ�������ı���
	int i = 0;

	/*
	 * �ڲ���
	 */
	private class InnerClass {
		// �ڲ������ֱ�ӷ����ⲿ�����
		public void test() {
			i++;
		}
	}

	// �ⲿ��ķ���
	public void test() {
		// �����ڲ������
		InnerClass inner = new InnerClass();
		// �����ڲ��෽��
		inner.test();
	}
}

/*
 * ������
 */
public class OutClassTest {
	public static void main(String[] args) {
		// �����ⲿ�����
		OutClass out = new OutClass();
		// �����ⲿ��ķ���
		// �˷����������ڲ��෽��
		out.test();
		System.out.println(out.i);
	}
}
