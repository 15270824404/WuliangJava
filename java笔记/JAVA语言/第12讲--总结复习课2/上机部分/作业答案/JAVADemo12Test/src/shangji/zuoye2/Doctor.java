package shangji.zuoye2;

/*
 * ҽ��(Doctor)������(name)�����(idNumber)����ַ(address)�Ȼ�����Ϣ��
 * ҽ���ַ�Ϊרҵҽ���ͷ�רҵҽ����
 * ��רҵҽ�������е�ס��������һ����
 * ��רҵҽ�����˾�������������Ϣ�⣬����������Ϣ��רҵ(speciality)��
 * ���������֮��Ĺ�ϵ������һ��Doctor�࣬���ڰ����й�ҽ���Ļ�����Ϣ��
 * �����ü̳д���һ����רҵҽ����(NonSpecialist)��һ��רҵҽ����(Specialisst)��
 * ��������Щ��Ķ�����ʾ���Ǹ��Ե���Ϣ��
 */
public class Doctor {
	private String name;
	private int idNumber;
	private String address;

	/*
	 * ��ʾ��Ϣ
	 */
	public void detail() {
		System.out.println("ҽ��������" + name + "\tҽ����ţ�" + idNumber + "\t��ַ��"
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
