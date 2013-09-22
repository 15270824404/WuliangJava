package shangji.zuoye1;

/*
 * 编写一个类ExceptionTest1，在main方法中使用try、catch、finally：
 * 在try块中，编写被0除的代码
 * 在catch块中，捕获被0除所产生的异常，并且打印异常信息
 * 在finally块中，打印一条语句
 */
public class ExceptionTest1 {

	public static void main(String[] args) {
		try {
			// 会发生异常的代码
			int number = 10 / 0;
		} catch (Exception e) {
			// 打印异常信息
			System.out.println("这是打印出的异常信息");
			e.printStackTrace();
		} finally {
			// 总是会执行的代码
			System.out.println("finally块：总是会执行");
		}

	}

}
