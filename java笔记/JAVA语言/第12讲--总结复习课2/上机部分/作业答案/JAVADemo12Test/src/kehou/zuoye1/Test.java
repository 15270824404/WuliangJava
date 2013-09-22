package kehou.zuoye1;

public class Test {

	public static void main(String[] args) {

		Employee e1 = new Employee("张三", 2000, "湖北武汉");
		Manager m1 = new Manager("李四", 2500, "湖北十堰", "财务部");
		Director d1 = new Director("王五", 2800, "湖北襄樊", 1800);
		e1.show();
		m1.show();
		d1.show();
	}
}
