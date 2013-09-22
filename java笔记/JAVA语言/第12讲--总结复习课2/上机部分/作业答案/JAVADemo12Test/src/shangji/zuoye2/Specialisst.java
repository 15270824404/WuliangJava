package shangji.zuoye2;

/*
 * 专业医生除了具有上述基本信息外，还有特有信息：专业(speciality)。
 */
public class Specialisst extends Doctor {

	private String speciality;

	/*
	 * 子类的构造函数
	 */
	public Specialisst(String name, int idNumber, String address,
			String speciality) {
		// 调用父类的构造函数
		super(name, idNumber, address);
		this.speciality = speciality;
	}

	/*
	 * 显示信息
	 */
	public void detail() {
		System.out.println("专业医生姓名：" + getName() + "\t医生编号：" + getIdNumber()
				+ "\t地址：" + getAddress() + "\t专业：" + this.speciality);
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

}
