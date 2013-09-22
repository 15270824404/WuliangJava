package shangji.zuoye2;

/*
 * 医生(Doctor)有姓名(name)、编号(idNumber)、地址(address)等基本信息，
 * 医生又分为专业医生和非专业医生。
 * 非专业医生所具有的住处与上述一样，
 * 但专业医生除了具有上述基本信息外，还有特有信息：专业(speciality)。
 * 请根据他们之间的关系，创建一个Doctor类，用于包含有关医生的基本信息。
 * 再利用继承创建一个非专业医生类(NonSpecialist)和一个专业医生类(Specialisst)，
 * 并利用这些类的对象显示他们各自的信息。
 */
public class Doctor {
	private String name;
	private int idNumber;
	private String address;

	/*
	 * 显示信息
	 */
	public void detail() {
		System.out.println("医生姓名：" + name + "\t医生编号：" + idNumber + "\t地址："
				+ address);
	}

	public Doctor(String name, int idNumber, String address) {
		super();
		this.name = name;
		this.idNumber = idNumber;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
