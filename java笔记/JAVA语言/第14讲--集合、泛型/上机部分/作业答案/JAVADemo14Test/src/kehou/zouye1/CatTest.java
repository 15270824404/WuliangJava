package kehou.zouye1;

import java.util.ArrayList;
import java.util.List;

/*
 * �κ���ҵ1
 * a)	����һ����Cat 
 * 		1.	��������name���ڹ��췽���н��г�ʼ��
 * 		2.	���һ������show()�����Դ�ӡname���Ե�ֵ
 * b)	����һ����CatTest�����main������ʵ��
 * 		1.	����һ��ArrayList����������Ӽ���Cat����
 * 		2.	�����ü��ϣ����Ҷ�ÿ��Cat�������show()����
 */
class Cat {
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * ��ӡname���Ե�ֵ
	 */
	public void show() {
		System.out.println("���֣�" + getName());
	}
}

public class CatTest {
	public static void main(String[] args) {
		List<Cat> list = new ArrayList<Cat>();
		list.add(new Cat("С��"));
		list.add(new Cat("С��"));
		list.add(new Cat("С��"));
		// ��������
		for (int i = 0; i < list.size(); i++) {
			((Cat) list.get(i)).show();
		}
	}
}
