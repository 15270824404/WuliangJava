package shangji.zuoye1;

/*
 * ��һ���������ȥʵ������ӿڣ��ٱ�дһ��������ʹ�ýӿ�
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
		// ʹ�ýӿ�
		Area t1 = new ShangJiZuoye1(10, 5);
		double area = t1.getArea();
		System.out.println("����ǣ�" + area);
	}
}
