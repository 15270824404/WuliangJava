/*
 * Phone.java
 * �ֻ���
 */
public class Phone {
	public void playMusic() {
		System.out.println("���ڲ���" + downloadMusic());
	}

	public String downloadMusic() {
		return "�ú���";
	}

	public void chargeCell() {
		Cell cell = new Cell();
		/* ���ʱҪ���õ����ķ��� */
		cell.brand = "iPhone";
		cell.getPower();
	}
}
