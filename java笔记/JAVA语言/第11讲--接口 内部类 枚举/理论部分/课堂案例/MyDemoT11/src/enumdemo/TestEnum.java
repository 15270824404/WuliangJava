package enumdemo;
/*
 * ����һ��ö��
 */
enum Color {
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
		case 0:			return Color.Red;
		case 1:			return Color.Green;
		case 2:			return Color.Blue;
		default:		return Color.Red;
		}
	}
}
public class TestEnum {
	public static void main(String[] args) {
		System.out.println("ö���е���ɫֵ�У�");
		for (Color c : Color.values()) {
			System.out.println(c);
		}
	}
}
