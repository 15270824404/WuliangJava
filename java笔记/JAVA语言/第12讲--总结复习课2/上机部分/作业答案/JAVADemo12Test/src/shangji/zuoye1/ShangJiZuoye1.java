package shangji.zuoye1;

/*
 * 用一个具体的类去实现这个接口，再编写一个测试类使用接口
 */
public class ShangJiZuoye1 implements Area {
	private double a;
	private double b;

	public ShangJiZuoye1(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return a * b;
	}

	public static void main(String[] args) {
		// 使用接口
		Area t1 = new ShangJiZuoye1(10, 5);
		double area = t1.getArea();
		System.out.println("面积是：" + area);
	}
}
