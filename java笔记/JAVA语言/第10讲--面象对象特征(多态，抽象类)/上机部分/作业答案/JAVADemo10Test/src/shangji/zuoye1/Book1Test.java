package shangji.zuoye1;

/*
 * ��д������Book1Test���в��ԣ�
 * �ֱ������ַ�ʽ��ɶ�����Book1����ĳ�ʼ�����������ֱ�������ǵ�detail��������������Ƿ���ȷ
 */
public class Book1Test {

	public static void main(String[] args) {
		Book1 b1 = new Book1("JAVA�����̳�", 377);
		b1.detail();
		Book1 b2 = new Book1("��ѧӢ��\t", 277, "����");
		b2.detail();

	}

}
