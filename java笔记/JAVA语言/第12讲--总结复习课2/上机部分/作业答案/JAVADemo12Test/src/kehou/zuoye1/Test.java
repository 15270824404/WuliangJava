package kehou.zuoye1;

public class Test {

	public static void main(String[] args) {

		Employee e1 = new Employee("����", 2000, "�����人");
		Manager m1 = new Manager("����", 2500, "����ʮ��", "����");
		Director d1 = new Director("����", 2800, "�����差", 1800);
		e1.show();
		m1.show();
		d1.show();
	}
}
