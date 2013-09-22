/*
 * С��2
 * 
 * ��дһ����Book2������̲ģ�
 * �������ԣ����ƣ�title����ҳ����pageNum��������ҳ����������200ҳ���������������Ϣ��������Ĭ��ֵ200
 * ���з�����detail�������ڿ���̨���ÿ���̲ĵ����ƺ�ҳ��
 * ���д������Ĺ��췽����������ɶ���ĳ�ʼ�����������ڹ��췽������ɶ�ҳ������Сֵ����
 * ��д������Book2Test���в��ԣ���ʼ��һ��Book2���󣬲����ø�Book2�����detail��������������Ƿ���ȷ
 */
class Book2 {
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

	//�������Ĺ��캯��
	public Book2(String title, int pageNum) {
		this.title = title;
		setPageNum(pageNum);
	}

	// �ڿ���̨���ÿ���̲ĵ����ƺ�ҳ��
	public void detail() {
		System.out.println("���ƣ�" + this.title + "\nҳ����" + this.pageNum);
	}
}
/*
 * ������
 */
public class Book2Test {
	public static void main(String[] args) {
		Book2 book = new Book2("JAVA�����̳�",377);
		book.detail();
	}
}
