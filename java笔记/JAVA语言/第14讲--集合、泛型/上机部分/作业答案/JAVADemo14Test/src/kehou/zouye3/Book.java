package kehou.zouye3;

/*
 * ����һ��Book�� 
 * �������ԣ�id(���)��title�����⣩��ʹ�ù��췽�����г�ʼ�� 
 * ��дtoString()���������Է���Title���Ե�ֵ 
 * ����һ��BookTest�����࣬���main������Ҫ�� 
 * ʹ��HashMap���д洢����ΪBook����ı�ţ�ֵΪBook���� 
 * ͨ��ĳһ����Ż�ȡBook���󣬲���ӡ��Book����ı���
 */
public class Book {
	private String id;
	private String title;

	@Override
	public String toString() {
		return getTitle();
	}

	public Book(String id, String title) {
		this.id = id;
		this.title = title;
	}

	public Book() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
