package shangji.zuoye2;

/*
 * 非专业医生类
 */
public class NonSpecialist extends Doctor{

	public NonSpecialist(String name, int idNumber, String address) {
		super(name, idNumber, address);
	}
	/*
	 * 显示信息
	 */
	public void detail() {
		System.out.println("非专业医生姓名：" + getName() + "\t医生编号：" + getIdNumber() + "\t地址："
				+ getAddress());
	}
}
