package kehou.zuoye3;

/*
 * �ٱ�д�����࣬������¹��ܣ�
 * ������100��ת���������¶Ȳ����
 * ������98.6��ת���ɻ����¶Ȳ����
 */
public class Test {

	public static void main(String[] args) {

		HuaShiToSheShi hs = new HuaShiToSheShi();
		System.out.println("����100��ת���������¶��ǣ�" + hs.convert(100));
		SheShiToHuaShi sh=new SheShiToHuaShi();
		System.out.println("������98.6��ת���ɻ����¶��ǣ�" + sh.convert(98.6));
	}

}
