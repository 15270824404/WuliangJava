package shangji.zuoye2;

/*
 * ��רҵҽ����
 */
public class NonSpecialist extends Doctor{

	public NonSpecialist(String name, int idNumber, String address) {
		super(name, idNumber, address);
	}
	/*
	 * ��ʾ��Ϣ
	 */
	public void detail() {
		System.out.println("��רҵҽ��������" + getName() + "\tҽ����ţ�" + getIdNumber() + "\t��ַ��"
				+ getAddress());
	}
}
