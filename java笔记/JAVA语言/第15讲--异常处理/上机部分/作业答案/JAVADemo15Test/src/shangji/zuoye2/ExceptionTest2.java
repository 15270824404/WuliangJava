package shangji.zuoye2;

/*
 * С��2
 * ��д��ExceptionTest2��
 * ��������������go()��main() (��ڷ���)
 * ��go����������Ҫ�׳��쳣���ڸ÷������ڣ��׳�һ��Exception����
 * ��main()�����У�����go������ʹ��try/catch����go�������׳����쳣
 */
public class ExceptionTest2 {

	/*
	 * ��go��������ʱ�׳��쳣���ڸ÷������ڣ��׳�һ��Exception����
	 */
	public void go() throws Exception {
		throw new Exception("go�����׳����쳣");
	}

	public static void main(String[] args) {
		ExceptionTest2 exp=new ExceptionTest2();
		try {
			exp.go();
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
}