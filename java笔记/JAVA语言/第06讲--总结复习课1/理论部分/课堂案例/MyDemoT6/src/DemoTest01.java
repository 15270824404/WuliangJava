/*
 * 程序调试案例：
 * 使用do-while打印5次“你好中兴3G学员！”
 * 以下程序只会打印4次
 */
public class DemoTest01 {
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println("你好中兴3G学员!");
			i = i + 1; // 即 i++
		} while (i < 5);
	}
}
