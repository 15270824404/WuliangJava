/**
 * Test.java
 * �ϻ���4�����κ���ҵ1������100֮��ż��֮��
 */
public class KeHou1 {
	public static void main(String[] args) {
		int num = 0; //����
		int sum = 0; //��ǰ֮��
		while(num <= 100){  //������100����
			sum = sum + num;  //�ۼ����
			num = num + 2;    //������һ��ż��
		}
		System.out.println("100֮�ڵ�ż��֮���ǣ�" + sum);
	}
}
