class Farmer02 {
	public void plant(Fruit fruit) {
		System.out.println("plant " + fruit.getName());
	}
	// // ��ֲƻ��
	// public void plantApple(Apple apple) {
	// System.out.println("plant  apple");
	// }
	//
	// // ��ֲ����
	// public void plantOrange(Orange orange) {
	// System.out.println("plant  orange");
	// }
	//
	// // ��ֲƻ��
	// public void plant(Apple apple) {
	// System.out.println("plant  apple");
	// }
	//
	// // ��ֲ����
	// public void plant(Orange orange) {
	// System.out.println("plant  orange");
	// }
}

public class FarmerTest02 {
	public static void main(String[] args) {
		Farmer02 farmer = new Farmer02();
		farmer.plant(new Apple());
	}
}
//����ˮ���࣬��Ϊ�������
class Fruit {
	public String getName() {
		return "";
	}
}
class Apple extends Fruit {
	// ������д����ķ���
	public String getName() {
		return "Apple";
	}
}

class Orange extends Fruit {
	// ������д����ķ���
	public String getName() {
		return "Orange";
	}
}
