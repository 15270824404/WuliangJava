/**
 * KehouZuoye2.java
 * ��2���ϻ����κ���ҵ2
 */
public class KehouZuoye2 {
	public static void main(String[] args) {
          int base = 3000;     //��������
          double ga;           //��۽���
          double hra;          //���ݽ���
          double salary;       //нˮ
          
          ga = base * 40 / 100;
          hra = base * 25 /100;
          salary = base + ga + hra; 
          
          /*�������ϸĿ*/
          System.out.println("��Ա���Ĺ���ϸĿΪ�� ");
          System.out.println("��������Ϊ�� " + base);
          System.out.println("��۽���Ϊ�� " + ga);
          System.out.println("�������Ϊ�� " + hra);
          System.out.println("Ա��нˮ�ǣ� " + salary);
	}
}
