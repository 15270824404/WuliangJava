package shangji.zuoye2;

/*
 * 小结2
 * 编写类ExceptionTest2：
 * 定义两个方法：go()和main() (入口方法)
 * 在go方法中声明要抛出异常，在该方法体内，抛出一个Exception对象
 * 在main()方法中，调用go方法，使用try/catch捕获go方法中抛出的异常
 */
public class ExceptionTest2 {

	/*
	 * 在go方法声明时抛出异常，在该方法体内，抛出一个Exception对象
	 */
	public void go() throws Exception {
		throw new Exception("go方法抛出的异常");
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