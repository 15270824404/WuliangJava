package shangji.zuoye1;

/*
 * ��дһ����Book1������̲ģ�
 * �������ԣ����ƣ�title����ҳ����pageNum�������ͣ�type��
 * ���з�����detail�������ڿ���̨���ÿ���̲ĵ����ơ�ҳ��������
 * �����������ι��췽����
 * ��һ�����췽���У����ý̲�����Ϊ������������̶������������Ե�ֵ�ɲ���������
 * �ڶ������췽���У��������Ե�ֵ���ɲ�������
 * 
 */
public class Book1 {
	private String title;
	private int pageNum;
	private String type;

	/*
	 * �����ڿ���̨���ÿ���̲ĵ����ơ�ҳ��������
	 */
	public void detail() {
		System.out
				.println("�̲����ƣ�" + title + "\tҳ����" + pageNum + "\t���ͣ�" + type);
	}

	/*
	 * ���췽���У����ý̲�����Ϊ������������̶������������Ե�ֵ�ɲ�������
	 */
	public Book1(String title, int pageNum) {
		this.title = title;
		this.pageNum = pageNum;
		this.type = "�����";
	}

	/*
	 * ���췽���У��������Ե�ֵ���ɲ�������
	 */
	public Book1(String title, int pageNum, String type) {
		this.title = title;
		this.pageNum = pageNum;
		this.type = type;
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

}
