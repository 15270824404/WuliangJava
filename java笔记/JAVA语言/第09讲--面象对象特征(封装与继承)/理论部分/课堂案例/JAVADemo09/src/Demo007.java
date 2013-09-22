/*
 * Person类
 */
class Person07 {
	public int age;
	public String sex;
}

// Man是Person的子类，同时又是Father的父类
class Man extends Person07 {
	public boolean marrired;
}

/*
 * Father类
 */
class Father extends Man {
	public String address;

	public void getInfo() {
		System.out.println("this is a father");
	}
}

/*
 * 测试类
 */
public class Demo007 {
	public static void main(String[] args) {

	}
}
