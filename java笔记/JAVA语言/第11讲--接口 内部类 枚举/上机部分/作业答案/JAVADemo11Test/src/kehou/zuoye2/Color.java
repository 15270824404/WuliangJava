package kehou.zuoye2;

public enum Color {
	// ö��ֵ���붨������ǰ��
	Red, Green, Yellow;
	/*
	 * ���������ֵ����һ��ö��ֵ
	 * 
	 * ������1ʱ���Ǻ��
	 * 
	 * ������2ʱ�� �ǻƵ� ��
	 * 
	 * ����3ʱ�����̵�
	 */
	public static Color getColor(int number) {
		switch (number) {
		case 1:
			return Color.Red;
		case 2:
			return Color.Yellow;
		case 3:
			return Color.Green;
		default:
			return Color.Red;
		}
	}
}
