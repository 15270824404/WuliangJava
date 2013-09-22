package xiaojie1;
/*
 * С��1��
 * ��дһ����Book1������̲ģ�
 * �������ԣ����ƣ�title����ҳ����pageNum�������ͣ�type��
 * ���з�����detail�������ڿ���̨���ÿ���̲ĵ����ơ�ҳ��������
 * �����������ι��췽������һ�����췽���У����ý̲�����Ϊ������������̶������������Ե�ֵ�ɲ���������
 * �ڶ������췽���У��������Ե�ֵ���ɲ�������
 * ��д������Book1Test���в��ԣ�
 * �ֱ������ַ�ʽ��ɶ�����Book1����ĳ�ʼ�����������ֱ�������ǵ�detail��������������Ƿ���ȷ
 */
class Book {
	// ����
	private String title;
	// ҳ��
	private int pageNum;
	// ����
	private String type;

	/*
	 * �����������Ĺ��캯��
	 */
	public Book(String title, int pageNum, String type) {
		this.title = title;
		this.pageNum = pageNum;
		this.type = type;
	}

	/*
	 * �����������Ĺ��캯��
	 */
	public Book(String title, int pageNum) {
		this.title = title;
		this.pageNum = pageNum;
		this.type = "�����";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/*
	 * ��ϸס�����������
	 */
	public void detail() {
		System.out.println("���ƣ�" + this.title + "\nҳ����" + this.pageNum
				+ "\n���ͣ�" + this.type);
	}
}

/*
 * ������
 */
public class Book1Test {
	public static void main(String[] args) {
		Book book1 = new Book("JAVA�����̳�", 377);
		book1.detail();
		Book book2 = new Book("Ӣ��", 177, "����");
		book2.detail();
	}
}