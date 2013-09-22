package kehou03;

/*
 * 编写父类MyPet（宠物），
 * 提供私有属性：name、ownerName、 age、color、weight（体重），方法show,speak、playWithOwner
 * 编写子类MyDog，子类中的属性沿用父类中的属性，并提供子类属性species(类别)
 */
public class MyPet {
	private String name;
	private String ownerName;
	private int age;
	private String color;
	private double weight;

	public void show() {
		System.out.println("名字：" + name + "\n主人姓名：" + ownerName + "\n年龄：" + age
				+ "\n颜色：" + color + "\n体重：" + weight + "KG");
	}

	public void speek(String voice) {
		System.out.println(name + "发出" + voice + "的声音！");
	}

	public void playWithOwner() {
		System.out.println(name + "在和主人" + ownerName + "玩儿！");
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
