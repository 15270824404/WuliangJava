package kehou03;

/*
 * ��д����MyPet�������
 * �ṩ˽�����ԣ�name��ownerName�� age��color��weight�����أ�������show,speak��playWithOwner
 * ��д����MyDog�������е��������ø����е����ԣ����ṩ��������species(���)
 */
public class MyPet {
	private String name;
	private String ownerName;
	private int age;
	private String color;
	private double weight;

	public void show() {
		System.out.println("���֣�" + name + "\n����������" + ownerName + "\n���䣺" + age
				+ "\n��ɫ��" + color + "\n���أ�" + weight + "KG");
	}

	public void speek(String voice) {
		System.out.println(name + "����" + voice + "��������");
	}

	public void playWithOwner() {
		System.out.println(name + "�ں�����" + ownerName + "�����");
	}

	public MyPet(String name, String ownerName, int age, String color,
			double weight) {
		this.name = name;
		this.ownerName = ownerName;
		this.age = age;
		this.color = color;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
