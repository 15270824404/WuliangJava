/**
 * ��ʾ����������
 */
public class VariableDomain {
	String color = "��ɫ"; // ��ɫ

	/* �� */
	public void run() {
		System.out.println("������0.1��/����ٶ���ǰ���ܡ�");
	}

	/* �� */
	public String bark() {
		String sound = "��";
		return sound;
	}

	/* �����ɫ */
	public String getColor() {
		return color;
	}

	/* ��ʾʨ������ */
	public String showLion() {
		return "����һ��" + getColor() + "�����ʨ��!������" + sound;
	}
}
