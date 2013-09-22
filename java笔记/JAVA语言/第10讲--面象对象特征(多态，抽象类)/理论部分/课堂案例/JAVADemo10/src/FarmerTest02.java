class Farmer02 {
	public void plant(Fruit fruit) {
		System.out.println("plant " + fruit.getName());
	}
	// // 种植苹果
	// public void plantApple(Apple apple) {
	// System.out.println("plant  apple");
	// }
	//
	// // 种植桔子
	// public void plantOrange(Orange orange) {
	// System.out.println("plant  orange");
	// }
	//
	// // 种植苹果
	// public void plant(Apple apple) {
	// System.out.println("plant  apple");
	// }
	//
	// // 种植桔子
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
//定义水果类，作为父类存在
class Fruit {
	public String getName() {
		return "";
	}
}
class Apple extends Fruit {
	// 子类重写父类的方法
	public String getName() {
		return "Apple";
	}
}

class Orange extends Fruit {
	// 子类重写父类的方法
	public String getName() {
		return "Orange";
	}
}
