package shangji.zuoye2;

/*
 * רҵҽ�����˾�������������Ϣ�⣬����������Ϣ��רҵ(speciality)��
 */
public class Specialisst extends Doctor {

	private String speciality;

	/*
	 * ����Ĺ��캯��
	 */
	public Specialisst(String name, int idNumber, String address,
			String speciality) {
		// ���ø���Ĺ��캯��
		super(name, idNumber, address);
		this.speciality = speciality;
	}

	/*
	 * ��ʾ��Ϣ
	 */
	public void detail() {
		System.out.println("רҵҽ��������" + getName() + "\tҽ����ţ�" + getIdNumber()
				+ "\t��ַ��" + getAddress() + "\tרҵ��" + this.speciality);
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

}
