package shangji;

/*
 * �ϻ���ҵ3
 * 
 * �����ʵ�ֶ�������ļ̳й�ϵ��
 * ���Animal��������Ϊ���ԣ�eat����˯����sleep��
 * ������������ӣ�Rabbit�����ϻ���Tiger��
 * ��Щ����Ե���Ϊ������ͬ�����ӳԲݣ��ϻ����⣩����˯������Ϊ��һ�µ�
 * ��ͨ���̳�ʵ���������󣬲���д������AnimalTest���в���
 */
public class AnimalTest {
	public static void main(String[] args) {
		// �������Ӷ���
		Animal a1 = new Rabbit();
		a1.eat();
		// �����ϻ�����
		Animal a2 = new Tiger();
		a2.eat();
	}
}

/*
 * ������
 */
class Animal {
	public void eat() {
		System.out.println("�����ڳԶ�����");
	}
}

// ������
class Rabbit extends Animal {
	public void eat() {
		System.out.println("���ӳԲݣ�");
	}
}

// �ϻ���
class Tiger extends Animal {
	public void eat() {
		System.out.println("�ϻ����⣡");
	}
}