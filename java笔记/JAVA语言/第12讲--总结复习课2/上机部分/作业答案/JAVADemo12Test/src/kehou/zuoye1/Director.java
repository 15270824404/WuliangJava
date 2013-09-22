package kehou.zuoye1;

public class Director extends Employee {
	private double transportAllowance;

	public Director(String name, double basic, String address,
			double transportAllowance) {
		super(name, basic, address);
		this.transportAllowance = transportAllowance;
	}

	public void show() {
		System.out.println("������" + getName() + "\t�������ʣ�" + getBasic() + "\t��ַ��"
				+ getAddress() + "\t��ͨ������" + getTransportAllowance());
	}
	
	public double getTransportAllowance() {
		return transportAllowance;
	}

	public void setTransportAllowance(double transportAllowance) {
		this.transportAllowance = transportAllowance;
	}
	
	
}
