package kehou.zuoye2;

public class Test {

	public static void main(String[] args) {
		NumberAddition n1 = new NumberAddition(20, 30);
		Object r1 = n1.add();
		System.out.println("����������ӵĽ���ǣ�" + r1);
		TextConcatenation t1 = new TextConcatenation("��ã�", "ZTE!");
		Object r2 = t1.add();
		System.out.println("�����ַ�����ӵĽ���ǣ�" + r2);
	}

}
