package kehou.zuoye3;

public class Test {

	/**
	 * ����������Test����Test����ʵ����Pet��Dog��Cat�����ֱ���ø��Ե�speakInfo����
	 */
	public static void main(String[] args) {
		Pet p = new Pet("����", "���������");
		Pet d = new Dog("С����", "������");
		Pet c = new Cat("С��è", "������");
		p.speakInfo();
		d.speakInfo();
		c.speakInfo();
	}

}
