/*
 * С��4��
 * ũ�����ũ��Ʒ�����ƻ�� 
 * ������ ��Ϊ�����͡�ƻ����û�й�ͬ�ĸ��࣬��������Ҫʹ�ýӿ������
 */
package xiaojie4;
//ũ��Ʒ�ӿ�
interface IProduce {
	public String name = " produce ";

	public String getName();
}

// ʵ��ũ��Ʒ�ӿڵ���
class Pig implements IProduce {
	public String getName() {
		return " pig ";
	}
}

// ʵ��ũ��Ʒ�ӿڵ���
class Apple implements IProduce {
	public String getName() {
		return " apple ";
	}
}

// ũ���ࡪ�����Գ���ũ��Ʒ
class Farmer {
	public void sale(IProduce produce) {
		System.out.println("���ۣ�" + produce.getName());
	}
}

/*
 * ������
 */
public class FarmerTest {
	public static void main(String args[]) {
		Farmer farmer = new Farmer();
		// �������ʲô����ũ��ľ����Ʒ����
		farmer.sale(new Apple());
		farmer.sale(new Pig());
	}
}
