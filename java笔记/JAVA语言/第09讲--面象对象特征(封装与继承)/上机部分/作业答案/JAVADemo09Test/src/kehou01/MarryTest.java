package kehou01;

public class MarryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("张三");
		p1.setAge(33);
		p1.setGender(true);
		if (p1.marry()) {
			System.out
					.println(p1.getName() + "的年龄是：" + p1.getAge() + "岁，可以结婚！");
		} else {
			System.out.println(p1.getName() + "的年龄是：" + p1.getAge()
					+ "岁，不可以结婚！");
		}
		Person p2 = new Person();
		p2.setName("李四");
		p2.setAge(21);
		p2.setGender(true);
		if (p2.marry()) {
			System.out
					.println(p2.getName() + "的年龄是：" + p2.getAge() + "岁，可以结婚！");
		} else {
			System.out.println(p2.getName() + "的年龄是：" + p2.getAge()
					+ "岁，不可以结婚！");
		}
	}

}
