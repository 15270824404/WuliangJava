package shangji.zuoye2;

public class Test {

	/**
	 * 利用这些类的对象显示他们各自的信息
	 */
	public static void main(String[] args) {
		Doctor d1 = new Doctor("张三", 10001, "中国上海");
		Doctor d2 = new NonSpecialist("李四", 10002, "中国北京");
		Doctor d3 = new Specialisst("王五", 10003, "中国天津", "内科专家");
		d1.detail();
		d2.detail();
		d3.detail();
	}

}
