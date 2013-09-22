package shangji.zuoye2;

/*
 * ��дһ��ö�٣�Color�������ڱ�ʾ������ɫ��Red��Green��Blue;
 * ��ö���б�дһ���������������ȡ��������һ����ɫ��
 * ͨ��ȡ����ǰϵͳʱ�䣨��������������ȡһ�����ֵ
 * ��д����������ȡ����ɫ
 */
public enum Color {
	// ö��ֵ���붨������ǰ��
	Red, Green, Blue;
	// ����һ��������ʾö��ֵ����Ŀ
	public static int number = Color.values().length;

	/*
	 * �������һ��ö��ֵ
	 */
	public static Color getRandomColor() {
		// ͨ��ȡ����ǰϵͳʱ�䣨��������������ȡһ�����ֵ
		long random = System.currentTimeMillis() % number;
		switch ((int) random) {
		case 0:
			return Color.Red;
		case 1:
			return Color.Green;
		case 2:
			return Color.Blue;
		default:
			return Color.Red;
		}
	}
}
