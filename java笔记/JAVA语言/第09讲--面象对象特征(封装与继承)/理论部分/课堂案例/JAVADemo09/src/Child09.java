class Person09 {
	public String name = "����";
	public int age = 0;
}

public class Child09 extends Person09 {
	public String sex;
	public int age = 2;

	/*
	 * ��super���ʸ������
	 * ��this���ʱ������
	 */
	public void getInfo() {
		System.out.println("�����е�������: " + super.age);
		System.out.println("�����е�������: " + this.age);
	}

	public static void main(String args[]) {
		Child09 child = new Child09();
		child.getInfo();
	}
}
