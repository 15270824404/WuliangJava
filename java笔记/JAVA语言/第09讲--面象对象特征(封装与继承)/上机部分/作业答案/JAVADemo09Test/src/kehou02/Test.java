package kehou02;

/*
 * 在测试 类中分别创建父类和子类的对象
 * 在子类中调用子类的构造方法和普通方法
 * 分别用父类和子类对象调用本类的构造方法和普通方法
 */
public class Test {

	public static void main(String[] args) {
		Man man = new Man("张三", "男");
		System.out.println("父类对象调用父类的方法");
		man.getInfo();// 父类对象调用父类的方法
		Father father = new Father("李四", "女", 22, "9876543210123", "湖北襄樊");
		System.out.println("\n子类对象调用子类的方法");
		father.getFatherInfo();// 子类对象调用子类的方法
		System.out.println("\n子类对象调用父类的方法");
		father.getInfo();// 子类对象调用父类的方法
	}

}
