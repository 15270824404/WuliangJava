package shangji.zuoye1;

/*
 * ��дһ����ExceptionTest1����main������ʹ��try��catch��finally��
 * ��try���У���д��0���Ĵ���
 * ��catch���У�����0�����������쳣�����Ҵ�ӡ�쳣��Ϣ
 * ��finally���У���ӡһ�����
 */
public class ExceptionTest1 {

	public static void main(String[] args) {
		try {
			// �ᷢ���쳣�Ĵ���
			int number = 10 / 0;
		} catch (Exception e) {
			// ��ӡ�쳣��Ϣ
			System.out.println("���Ǵ�ӡ�����쳣��Ϣ");
			e.printStackTrace();
		} finally {
			// ���ǻ�ִ�еĴ���
			System.out.println("finally�飺���ǻ�ִ��");
		}

	}

}
