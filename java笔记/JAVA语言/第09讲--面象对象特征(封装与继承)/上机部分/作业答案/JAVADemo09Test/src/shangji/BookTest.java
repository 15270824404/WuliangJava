package shangji;

/*
 * �ϻ���ҵ1
 * 
 * ��дһ����Book������̲�:
 * �������ԣ����ƣ�title����ҳ����pageNum��������ҳ����������200ҳ���������������Ϣ��������Ĭ��ֵ200
 * Ϊ���������ø�ֵ��ȡֵ����
 * ���з�����detail�������ڿ���̨���ÿ���̲ĵ����ƺ�ҳ��
 * ��д������BookTest���в��ԣ�ΪBook��������Ը����ʼֵ��������Book�����detail��������������Ƿ���ȷ
 */
class Book {
	// ����
	private String title;
	// ҳ��
	private int pageNum = 200;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageNum() {
		return pageNum;
	}

	//ͨ����װ������ҳ���������200
	public void setPageNum(int pageNum) {
		if (pageNum < 200) {
			this.pageNum = 200;
		} else {
			this.pageNum = pageNum;
		}
	}

	// �ڿ���̨���ÿ���̲ĵ����ƺ�ҳ��
	public void detail() {
		System.out.println("���ƣ�" + this.title + "\nҳ����" + this.pageNum);
	}
}

/*
 * ������
 */
public class BookTest {

	public static void main(String[] args) {
		Book book = new Book();
		book.setTitle("JAVA�����̳�");
		book.setPageNum(377);
		book.detail();
	}
}
