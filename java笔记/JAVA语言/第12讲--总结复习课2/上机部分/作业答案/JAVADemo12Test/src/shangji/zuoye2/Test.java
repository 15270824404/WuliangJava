package shangji.zuoye2;

public class Test {

	/**
	 * ������Щ��Ķ�����ʾ���Ǹ��Ե���Ϣ
	 */
	public static void main(String[] args) {
		Doctor d1 = new Doctor("����", 10001, "�й��Ϻ�");
		Doctor d2 = new NonSpecialist("����", 10002, "�й�����");
		Doctor d3 = new Specialisst("����", 10003, "�й����", "�ڿ�ר��");
		d1.detail();
		d2.detail();
		d3.detail();
	}

}
