package errordemo;

class Book {
	private String name = "java�����̳�";

	public String getAuthor() {
		return "����";
	}
}

class Media {
	private String name = " media";

	public String getInfo() {
		return name;
	}
}
//����ͼ�������һ�֣�ͬʱ����һ�ֶ�ý�� 
//����JAVA��֧�ֶ�̳У�һ����ֻ����һ������
//���Բ�������ʵ�֣�Ҫ���������⣬��Ҫʹ�õ��ӿ�
public class MediaBook extends Book , Media {
	private String name = "mediaBook";
}
