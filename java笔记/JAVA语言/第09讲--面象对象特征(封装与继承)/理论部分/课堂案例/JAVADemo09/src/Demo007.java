/*
 * Person��
 */
class Person07 {
	public int age;
	public String sex;
}

// Man��Person�����࣬ͬʱ����Father�ĸ���
class Man extends Person07 {
	public boolean marrired;
}

/*
 * Father��
 */
class Father extends Man {
	public String address;

	public void getInfo() {
		System.out.println("this is a father");
	}
}

/*
 * ������
 */
public class Demo007 {
	public static void main(String[] args) {

	}
}
