package kehou01;

public class MarryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("����");
		p1.setAge(33);
		p1.setGender(true);
		if (p1.marry()) {
			System.out
					.println(p1.getName() + "�������ǣ�" + p1.getAge() + "�꣬���Խ�飡");
		} else {
			System.out.println(p1.getName() + "�������ǣ�" + p1.getAge()
					+ "�꣬�����Խ�飡");
		}
		Person p2 = new Person();
		p2.setName("����");
		p2.setAge(21);
		p2.setGender(true);
		if (p2.marry()) {
			System.out
					.println(p2.getName() + "�������ǣ�" + p2.getAge() + "�꣬���Խ�飡");
		} else {
			System.out.println(p2.getName() + "�������ǣ�" + p2.getAge()
					+ "�꣬�����Խ�飡");
		}
	}

}
