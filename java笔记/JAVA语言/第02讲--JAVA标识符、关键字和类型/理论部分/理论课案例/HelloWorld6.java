public class HelloWorld6 {
	public static void main(String[] args) {

		int html = 89; // HTML����
		int java = 90; // Java����
		int sql = 78; // SQL����
		int diffen; // ����֮��
		double avg; // ƽ����
		// ����ɼ�������
		System.out.println("-----------------");
		System.out.println("HTML\tJAVA\tSQL");
		System.out.println(html + "\t" + java + "\t" + sql);
		System.out.println("-----------------");

		diffen = java - sql; // ����java �κ�sql�εĳɼ���
		System.out.println("Java��SQL�ĳɼ��" + diffen);

		avg = (html + java + sql) / 3; // ����ƽ����
		System.out.println("���ſε�ƽ������: " + avg);

	}
}